package modernjavainaction.hackerrank;

import java.util.ArrayList;
import java.util.List;


// List vs ArrayList vs Arrays

// functional
public class hackerrank1 {

    public static void main(String... args) {
        hourGlass executor = new hourGlass();
        executor.execute();
    }
}

class hourGlass {

    public void execute() {

        List<List<Integer>> arr = new ArrayList<>();

        /*IntStream.range(1, arr.size()).forEach(rowIndex -> {
            arr.forEach(row -> {

                IntStream.range(0, arr.get(rowIndex).size()).forEach(columnIndex -> {
                    getHourGlassSum(arr, rowIndex, columnIndex);
                });
            });
        });*/

        int topValue = Integer.MIN_VALUE;

        for (int rowIndex = 0; rowIndex < arr.size() - 2; rowIndex++) {
            for (int columnIndex = 0; columnIndex < arr.get(0).size() - 2; columnIndex++ ) {
                int currentHourGlassValue = getHourGlassSum(arr, rowIndex, columnIndex);
                topValue = Math.max(topValue, currentHourGlassValue);
            }
        }

        System.out.println(topValue);
    }

    private int getHourGlassSum(List<List<Integer>> arr, int rowIndex, int columnIndex) {

        int horizontalStartingPoint = columnIndex;
        int horizontalMiddlePoint = columnIndex + 1;
        int horizontalEndingPoint = columnIndex + 2;
        int verticalBodyIndex = rowIndex + 1;
        int verticalLowExtremityIndex = rowIndex + 2;

        // TODO: too much boiler plate
        int upperExtremityValue = getSum(horizontalStartingPoint, horizontalEndingPoint, arr.get(rowIndex));
        int bodyValue = arr.get(verticalBodyIndex).get(horizontalMiddlePoint);
        int lowerExtremityValue = getSum(horizontalStartingPoint, horizontalEndingPoint, arr.get(verticalLowExtremityIndex));
        System.out.println(upperExtremityValue + " " + bodyValue + " " + lowerExtremityValue + " : " + (upperExtremityValue + bodyValue + lowerExtremityValue));
        return upperExtremityValue + bodyValue + lowerExtremityValue;
    }

    public int getSum(int from, int to, List<Integer> list) {

        /*AtomicInteger index = new AtomicInteger(0);
        return list.stream()
                .takeWhile(item -> index.incrementAndGet() <= 3)
                .mapToInt(Integer::intValue)
                .sum();*/

        int sum = 0;
        for (int i = from; i <= to; i++ ) {
            sum += list.get(i);
        }
        return sum;
    }
}
