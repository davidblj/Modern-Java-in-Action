package modernjavainaction.hackerrank;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class hackerrank7 {
  public static void main(String[] args) {
    new MinimumSwaps(new ArrayList<>(List.of(7,1,3,2,4,5,6))).execute();
    new MinimumSwaps(new ArrayList<>(List.of(4,3,1,2))).execute();
    new MinimumSwaps(new ArrayList<>(List.of(4,3,1,2))).execute();
  }
}

// Tc O(n*m)
// Sc O(n)
@RequiredArgsConstructor
class MinimumSwaps {

  private final AtomicInteger atomicInteger = new AtomicInteger(0);
  private final ArrayList<Integer> unorderedArray;

  // https://www.hackerrank.com/challenges/minimum-swaps-2/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
  public void execute() {
    IntStream.range(0, unorderedArray.size()).forEach(index -> {
      int currentValue = unorderedArray.get(index); // CHECK OUT THE UNBOXING
      int naturalOrderValue = index + 1;
      if (currentValue != naturalOrderValue) {
        int targetIndexSwap = unorderedArray.indexOf(naturalOrderValue);
        swapValues(index, targetIndexSwap);
      }
    });
    System.out.println(unorderedArray);
    System.out.println(this.atomicInteger.get());
  }
  
  private void swapValues(int sourceIndex, int targetIndex) {
    Integer sourceValue = unorderedArray.get(sourceIndex);
    Integer targetValue = unorderedArray.get(targetIndex);
    unorderedArray.set(targetIndex, sourceValue);
    unorderedArray.set(sourceIndex, targetValue);
    this.atomicInteger.incrementAndGet();
  }
}

@RequiredArgsConstructor
class MinimumSwapsNativeArrays {

  private final AtomicInteger atomicInteger = new AtomicInteger(0);
  private final int[] unorderedNativeArray;

  // https://www.hackerrank.com/challenges/minimum-swaps-2/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
  // Tc O(n*m)
  // Sc O(n)
  // Is low-level and optimized by the JVM. Minimal overhead — directly accesses the array elements.
  public void execute() {
    
    int index = 0;
    for (int currentValue : unorderedNativeArray) {
      int naturalOrderValue = index + 1;
      if (currentValue != naturalOrderValue) {
        int targetIndexSwap = unorderedNativeArray.;
        swapValues(index, targetIndexSwap);
      }
    }
    
    IntStream.range(0, unorderedNativeArray.size()).forEach(index -> {
      int currentValue = unorderedNativeArray.get(index); // CHECK OUT THE UNBOXING
      int naturalOrderValue = index + 1;
      if (currentValue != naturalOrderValue) {
        int targetIndexSwap = unorderedNativeArray.indexOf(naturalOrderValue);
        swapValues(index, targetIndexSwap);
      }
    });
    System.out.println(unorderedNativeArray);
    System.out.println(this.atomicInteger.get());
  }

  private int indexOf() {

  }

  private void swapValues(int sourceIndex, int targetIndex) {
    Integer sourceValue = unorderedArray.get(sourceIndex);
    Integer targetValue = unorderedArray.get(targetIndex);
    unorderedArray.set(targetIndex, sourceValue);
    unorderedArray.set(sourceIndex, targetValue);
    this.atomicInteger.incrementAndGet();
  }
}