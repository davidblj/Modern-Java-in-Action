package modernjavainaction.hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class notes {
  
  public void doNotes() {

    // List vs ArrayList vs Arrays

    Stack<String> bracketStack = new Stack<>();

    // 
    List<String> setList = List.of("string".split(""));
    HashSet<String> hashSet = new HashSet<>(setList);

    // String interpolation

    // Collectors

    // Lists
    setList.subList(0, 1);
    
    // Streams 
    // short circuit operations
    IntStream.range(0, 10).forEach((el) -> {});
    
    // Maps
    // maps vs hashmaps
    
    // 1 7 3 2 4 5 6 _ 1
    // 1 2 3 7 4 5 6 _ 2
    // 1 2 3 4 7 5 6 _ 3
    // 1 2 3 4 5 7 6 _ 4
    // 1 2 3 4 5  6 7 _ 5
  }
}
