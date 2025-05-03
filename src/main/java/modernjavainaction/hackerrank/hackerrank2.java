package modernjavainaction.hackerrank;

import java.util.List;
import java.util.OptionalInt;

// https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

public class hackerrank2 {

    public static void main(String... args) {
        minimumBribes executor = new minimumBribes();
        executor.execute();
    }
}

class minimumBribes {

    // https://www.hackerrank.com/challenges/new-year-chaos/problem
    public void execute() {
        minimumBribes();
    }

    public void minimumBribes() {

        minimumBribesFunctional(List.of(1,2,5,3,4,7,8,6), 1, 0)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Too chaotic"));
    }

    public OptionalInt minimumBribesFunctional(List<Integer> queue, int currentPosition, int bribes) {

        List<Integer> newQueue = queue.subList(1, queue.size());
        int originalTicketNumber = queue.get(0);
        int bribesTaken = originalTicketNumber >= currentPosition ? originalTicketNumber - currentPosition : 0;

        if (bribesTaken > 2) {
            return OptionalInt.empty();
        }

        if (newQueue.isEmpty()) {
            return OptionalInt.of(bribes);
        }

        return minimumBribesFunctional(newQueue, currentPosition + 1, bribes + bribesTaken);
    }
}

