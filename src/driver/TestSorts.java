package driver;

import sorts.BasicSorts;
import utilities.SortingUtilities;

import java.util.Arrays;

/**
 *
 * @author Hector Gonzalez
 * @version V 1.0 04/22/22 1235
 */
public class TestSorts
{
    /**
     * @param args no arguments
     *  Entry point this program test the different sorts.
     */
    public static void main(String[] args)
    {
//      int[] testArray ={5,-1,7,9,3,17,24,45,12,25};
      int [] testArray = SortingUtilities.generateRandomArray(10,1,100);

        BasicSorts sorts = new BasicSorts();

        // Bubble Sort
//        System.out.println("Bubble sort before");
//        System.out.println(Arrays.toString(testArray));
//        sorts.bubbleSort(testArray);
//        System.out.println("Bubble sort after");
//        System.out.println(Arrays.toString(testArray));
//        System.out.println(System.lineSeparator());


       // Selection Sort
//        System.out.println("Selection sort before");
//        System.out.println(Arrays.toString(testArray));
//        sorts.selectionSort(testArray);
//        System.out.println("Selection sort after");
//        System.out.println(Arrays.toString(testArray));
//        System.out.println(System.lineSeparator());


        //   Insertion Sort
        System.out.println("Insertion sort before");
        System.out.println(Arrays.toString(testArray));
        sorts.insertionSort(testArray);
        System.out.println("Insertion sort after");
        System.out.println(Arrays.toString(testArray));
        System.out.println(System.lineSeparator());




    }
}
