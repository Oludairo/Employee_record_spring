package chapterSeven;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter score " +(i+1));
            int score = input.nextInt();
            scores[i] = score;
        }
        int total = Array.calculatesTotalOf(scores);
        System.out.println("total is "+ total);

        double average = Array.calculateTheAverageOf(scores);
        System.out.println("average is "+ average);

        int maximum = Array.calculateTheMaximumOf(scores);
        System.out.println("maximum is "+ maximum);

        int minimum = Array.calculateTheMinimumOf(scores);
        System.out.println("minimum is "+ minimum);


    }
       public static int calculatesTotalOf(int[] scores) {
        int total = 0;
           for (int i : scores) {

               total = total + i;
           }
           return total;
       }

       public static double calculateTheAverageOf(int[] scores){
            double average;
            double sum = calculatesTotalOf(scores);
               average = sum / scores.length;
               return  average;
       }

       public static int calculateTheMaximumOf(int[] scores){
        int maximum = Integer.MIN_VALUE;
        for (int score : scores) {

            maximum = Math.max(maximum, score);
        }
        return maximum;
      }
        public static int calculateTheMinimumOf(int[] scores) {
            int minimum = Integer.MAX_VALUE;
            for (int score : scores) {
                if (minimum > score) {
                    minimum = score;
                }

            }
            return minimum;
        }



}
