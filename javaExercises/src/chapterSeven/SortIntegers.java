package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntegers {

    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ... ultimately have an array with 106, 81, 26, 15, 5 in it.
    // Set up the program so that the number to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out hoe to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortArray(myIntegers);
        printArray(sorted);
    }


    public static int[] getIntegers(int number){
        Scanner input = new Scanner(System.in);
        int[] array = new int[number];
        System.out.println("Enter " + number +  " integer values.\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }
        return array;

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " Contents " + array[i]);

        }

    }

    public static int[] sortArray(int[] array){
//        int[] sortArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortArray[i] = array[i];
//        }
        int[] sortArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < array.length-1; i++) {
                if(sortArray[i] < sortArray[i+1]){
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i+1];
                    sortArray[i+1] = temp;
                    flag = true;
                }

            }
        }
        return sortArray;
    }
}
