package chapterSeven;

import java.util.Arrays;

public class ArrayScore {
    public static void main(String[] args) {
        int[] scores = {2, 5, 6, 8, 9};
        int[] sum = ArrayScore.canCalculateSumsAndStore(scores);
        System.out.println(Arrays.toString(sum));

        int sums = Array.calculatesTotalOf(scores);
        System.out.println("total is "+ sums);

        int maximum = ArrayScore.calculateTheMaximumOf(sum);
        System.out.println("maximum is "+ maximum);

        int minimum = ArrayScore.calculateMinimumOf(sum);
        System.out.println("minimum is "+ minimum);
    }

    private static int calculateMinimumOf(int[] sums) {
        int minimum = Integer.MAX_VALUE;
        for (int scores : sums) {

            minimum = Math.min(minimum, scores);
        }
        return minimum;
    }

    private static int calculateTheMaximumOf(int[] sums) {
        int maximum = Integer.MIN_VALUE;
        for (int scores : sums) {

            maximum = Math.max(maximum, scores);
        }
        return maximum;
    }

    public static int[] canCalculateSumsAndStore(int[] scores){
        int total = 0;

        for (int score : scores) {
          //total = total + scores[score];
            total = total + score;
        }
        int[] sums = new int[scores.length];
        for (int i = 0; i < sums.length;) {
                sums[i] = total - scores[i];
                i++;
        }
        return sums;
    }




}
