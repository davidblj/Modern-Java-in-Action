package modernjavainaction.hackerrank;

import java.util.*;

public class hackerrank5 {

    public static void main(String[] args) {
        new BalancedBrackets().execute("{[()]}");
        new BalancedBrackets().execute("{[(])}");
        new BalancedBrackets().execute("{}]");
        new BalancedBrackets().execute("{}{");
        new BalancedBrackets().execute("{[(((([{{{}}}]))))]}");
    }
}

class BalancedBrackets {

    // https://www.hackerrank.com/interview/interview-preparation-kit/stacks-queues/challenges
    public void execute(String bracketString) {

        List<String> split = Arrays.asList(bracketString.split(""));
        Map<String, String> brackets = new HashMap<>();
        brackets.put("]", "[");
        brackets.put("}", "{");
        brackets.put(")", "(");

        Stack<String> bracketStack = new Stack<>();

        boolean isNotBalanced = split.stream().anyMatch(bracket -> {

            String matchingPair = Optional.ofNullable(brackets.get(bracket)).orElse("");
            if (matchingPair.isEmpty()) {
                bracketStack.push(bracket);
                return false;
            } else {
                return validateLastOpenedBracket(bracketStack, matchingPair);
            }
        });

        if (isNotBalanced || !bracketStack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
    
    private boolean validateLastOpenedBracket(Stack<String> bracketStack, String matchingPair) {
        if (bracketStack.isEmpty()) {
            return true;
        } else {
            String poppedBracket = bracketStack.pop();
            return !matchingPair.equals(poppedBracket);
        }
    }
}