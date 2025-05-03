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
  }
}
