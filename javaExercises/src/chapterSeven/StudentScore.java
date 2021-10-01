package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScore {

    public static void main(String[] args) {

        System.out.println("Enter the number of student: ");
        Scanner input = new Scanner(System.in);
        int numberOfStudent = input.nextInt();
        //int student = new int[numberOfStudent];
        System.out.println("Enter the number of subject student offers: ");
        int numberOfSubject = input.nextInt();


        double[][] studentScores = new double[numberOfStudent][numberOfSubject];
        for (int row = 0; row < studentScores.length; row++) {
            for (int column = 0; column < studentScores[row].length; column++) {
                System.out.println("Enter scores of subject: " + (column + 1));
                double scores = input.nextDouble();
                studentScores[row][column] = scores;
            }

        }
        System.out.println(Arrays.deepToString(studentScores));
        displayHeader(studentScores);


    }


        public static void displayHeader(double[][] studentScores){
            for (int subject = 0; subject < studentScores[0].length; subject++) {
                System.out.printf("\t\t" + "Subject %d ", subject + 1);

            }
            System.out.printf("%7s", "Total");
            System.out.printf("%12s", "Average");
        }







//        System.out.println();
//        int[] totalArray = new int[studentScores.length];
//
//        for (int row = 0; row < studentScores.length; row++) {
//            int total = 0;
//            System.out.printf("Student%2d", row + 1);
//            for (int column = 0; column < studentScores[row].length; column++) {
//                System.out.printf("%8d", studentScores[row][column]);
//
//                total += studentScores[row][column];
//            }
//
//            totalArray[row] = total;
//            System.out.printf("%15d", total);
//            System.out.println();
//        }



//        total[row] = 0;
//        for (column = 0; column <= studentScores.length - 1; column++) {
//            total[i] += [i][j];
//        }
//        for (int row = 0; row < studentScores.length; row++) {
//            for (int column = 0; column < studentScores[row].length; column++)
//                System.out.printf("%d ", studentScores[row][column]);
//                System.out.println("");
//        }



//
//    private int numberOfStudent;
//    private int numberOfSubject;
//    private int NumberOfStudent;
//    private int NumberOfSubject;
//
//    public void setNumberOfStudent(int numberOfStudent) {
//        this.numberOfStudent = numberOfStudent;
//    }
//
//    public void setNumberOfSubject(int numberOfSubject) {
//        this.numberOfSubject = numberOfSubject;
//    }
//
//    public int getNumberOfStudent() {
//        return NumberOfStudent;
//    }
//
//    public int getNumberOfSubject() {
//        return NumberOfSubject;
//    }

}
