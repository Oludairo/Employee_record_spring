package chapterSeven;

public class ArrayDimensions {

    public static void main(String[] args) {

 //      String[][] xox = {{"X", "O", "X"}, {"O", "X", "O"}, {"X", "O", "X"}};
 //      int[][] xox = new int[3][3];

 //      for (int i = 0; i < xox.length; i++) {
 //          for (int j = 0; j < xox.length +1; j++) {
 //              System.out.print((xox[i][j]) +" ");

 //          }
 //          System.out.println();


 //       }

       // int[] array = new int[10];
       // System.out.printf("%s%8s%n", "Index", "Value");

       //for (int counter = 0; counter < array.length; counter++) {
       //    System.out.printf("%5d%8d%n", counter, array[counter]);


        //}


     //int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
     //System.out.printf("%s%8s%n", "Index", "Value");

     //for (int counter = 0; counter < array.length; counter++) {
     //    System.out.printf("%5d%8d%n", counter, array[counter]);

     //}


     //  final int ARRAY_LENGTH = 10;
     //  int[] array = new int[ARRAY_LENGTH];
     //  System.out.printf("%s%8s%n", "List", "Value");

    //   for (int counter = 0; counter < array.length; counter++)
    //       array[counter] = 2 + 2*counter;

    //   for (int counter = 0; counter < array.length; counter++)
    //       System.out.printf("%5d%8d%n", counter, array[counter]);


     //  int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
     //      int total = 0;

     //  for (int counter = 0; counter < array.length; counter++)
     //      total = total + array[counter];

     //      System.out.printf("total of array elements: %d%n", total);


        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.printf("%s%n", "Distribution");
        for (int counter = 0; counter < array.length; counter++) {

            if(counter == 10)
            System.out.printf("%5d: ", 100);

            else
                System.out.printf("%02d-%02d: ", counter*10, counter*10+9);

            for (int star = 0; star < array[counter]; star++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
