public class TrickyAverage {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4};
        System.out.println(trickyAverage(test));
    }

    private static double trickyAverage(int[] numbers) {
        double sum = 0;
        double average;
        int smallestOdd = -1;
        int largestEven = -1;
        boolean largestEvenValid = false;
        boolean smallestOddValid = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                if (smallestOddValid == false) {
                    smallestOdd = numbers[i];
                    smallestOddValid = true;
                } else {
                    smallestOdd = Math.min(smallestOdd, numbers[i]);
                }
            } else {
                if (largestEvenValid == false) {
                    largestEven = numbers[i];
                    largestEvenValid = true;
                } else {
                    largestEven = Math.max(largestEven, numbers[i]);
                }
            }
        }

        sum = (double) largestEven + (double) smallestOdd;
        average = sum / 2;
        return average;
    }
}