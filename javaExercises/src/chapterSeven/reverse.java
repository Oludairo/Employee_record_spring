package chapterSeven;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter ur name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        for (int i = name.length()-1; i >= 0; i--) {
            System.out.print(name.charAt(i));

        }



    }
}
