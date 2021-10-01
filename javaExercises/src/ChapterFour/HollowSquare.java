package ChapterFour;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any length: ");
        int length = input.nextInt();

        for (int row = 1; row <= length; row++) {
            for (int column = 1; column <= length; column++)

               // if( column != 1 && column < length)
                 //   System.out.print(" ");

                System.out.print(" *");
            System.out.println();

        }
    }
}
