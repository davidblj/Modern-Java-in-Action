package modernjavainaction.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class hackerrank4 {

    public static void main(String... args) {
        SherlockAndAnagrams executor = new SherlockAndAnagrams();
        executor.execute("abcddadc");
    }
}

class SherlockAndAnagrams {

    // https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
    public void execute(String charArray) {

        List<String> split = Arrays.asList(charArray.split(""));
        Map<String, Integer> substringMap = new HashMap<>();

        IntStream.range(0, split.size()).forEach(startingIndex -> {
            IntStream.range(startingIndex, split.size()).forEach(endingIndex -> {
                List<String> sortedSubstringList = sortList(split, startingIndex, endingIndex);
                if (sortedSubstringList.size() != split.size()) {
                    String substring = sortedSubstringList.stream().reduce("", String::concat);
                    substringMap.put(substring, substringMap.get(substring) == null ? 1 : substringMap.get(substring) + 1);
                }
            });
        });

        int value = substringMap.values().stream()
                .map(n -> n * (n - 1) / 2)
                .reduce(0, Integer::sum);

        System.out.println(value);
    }

    public List<String> sortList(List<String> unsortedList, int startingIndex, int endingIndex) {
        return unsortedList.subList(startingIndex, endingIndex + 1)
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

}