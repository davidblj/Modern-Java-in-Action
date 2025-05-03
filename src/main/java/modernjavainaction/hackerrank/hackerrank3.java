package modernjavainaction.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class hackerrank3 {

    public static void main(String... args) {
        CommonSubstring executor = new CommonSubstring();
        executor.execute("hii", "world");
    }
}

class CommonSubstring {

    // https://www.hackerrank.com/challenges/two-strings/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
    public void execute(String subset, String set) {

        List<String> subsetList = List.of(subset.split(""));
        List<String> setList = List.of(set.split(""));

        HashSet<String> hashSet = new HashSet<>(subsetList);
        HashSet<String> hashSet2 = new HashSet<>(setList);
        hashSet.retainAll(hashSet2);
        String answer = !hashSet.isEmpty() ?  "YES" : "NO";
        System.out.println(answer);
    }

}