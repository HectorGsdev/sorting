package sorts;

import utilities.SortingUtilities;

/**
 * @author Hector Gonzalez
 * @version V 1.0 04/22/22 1234
 */
public class BasicSorts
{
    /**
     * @param array received the array to be sorted as a parameter
     *              using bubble sort  algorithm
     */
    public void bubbleSortMine(int[] array)
    {
        // this determines how many "passes over the array
        for (int i = 0; i < array.length; i++)
        {
            //this determines which adjacent elements will bubble
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                // see if adjacent elements are out of order
                if (array[j] > array[j + 1])
                {
                    //swap them
                    SortingUtilities.swap(array, j, j + 1);
                }
            }
        }
    }





    /**
     * * * * * * * * * * SELECTION SORT * * * * * * * * * * * * *
     *
     * @param array received the array to be sorted as a parameter
     *              using selection sort  algorithm
     */
    public void selectionSortMine(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            // find the index of the smallest element in the array starting at position i
            int smallIndex = (findIndexSmaller(array, i));
            // swap the smallest element in the array with the element in position array[i]
            SortingUtilities.swap(array, i, smallIndex);
        }
    }

    /**
     * helper method to find the smallest number in the array and return the index
     *
     * @param array            The array where this function is going to look for the index of the smallest number
     * @param startingPosition each iteration the function will start the search after the
     * @return the index of the smallest number in the array
     */
    public int findIndexSmaller(int[] array, int startingPosition)
    {
        int tempSmall = Integer.MAX_VALUE;
        int resultIndex = 0;
        for (int j = startingPosition; j < array.length; j++)
        {
            if (array[j] < tempSmall)
            {
                tempSmall = array[j];
                resultIndex = j;
            }
        }
        return resultIndex;
    }






    /**
     *   * * * * * * * * * * INSERTION SORT * * * * * * * * * * * * *
     *
     * @param array received the array to be sorted as a parameter
     *              using insertion sort  algorithm
     */
    public void insertionSortMine(int[] array)
    {
        int newPosition;
    //    int elementToInsert;
        int originalPosition;
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j > i; j = j - 1)
            {
                if (array[j] < array[i])
                {
                   newPosition =  findPosition(array, j);
                  // elementToInsert = array[j];
                   originalPosition = j;
                   insertElement(array, originalPosition,newPosition);
//                insertElement(array, elementToInsert,originalPosition,newPosition);

                }

            }
           // System.out.println();
        }
    }




    /**
     * Helper method - this method inserts the element in its proper position
     *
     * @param array array to be sorted
     * @param originalPosition  The original index of the element
     * @param newPosition The sorted position of the element
     */
    public void insertElement(int[] array,  int originalPosition, int newPosition)
//    public void insertElement(int[] array, int element,  int originalPosition, int newPosition)
    {
        int currentPosition = originalPosition;

        while (currentPosition != newPosition) {
            SortingUtilities.swap(array, currentPosition-1, currentPosition);
            currentPosition = currentPosition -1;
        }
    }




    /**
     * Helper method to find the position where one element need to be inserted.
     * @param array       Array to be sorted
     * @param insertIndex index of the number to be inserted
     * @return the position where the element should go
     */
    public int findPosition(int[] array, int insertIndex)
    {

        // find position
        for (int i = 0; i < array.length; i++)
        {
            if (array[insertIndex] < array[i])
            {
                return i;
            }
        }
        return -1;
    }





    public void bubbleSort(int[] array)
    {
        //this determines how many "passes" over the array
        for (int i = 0; i < array.length; i++)
        {
            //this determines which adjacent elements will bubble
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                //see if adjacent elements are out of order
                if (array[j] > array[j + 1])
                {
                    SortingUtilities.swap(array, j, j + 1);
                }
            }
        }
    }

    public static void insertionSort(int[] array)
    {
        //for each new element in the array
        for (int i = 1; i < array.length; i++)
        {
            //move the element into the lower (sorted) positions in the array
            for (int j = i; j >= 1; j--)
            {
                //if out of order swap, otherwise short-circuit and move on
                //to the next element
                if (array[j] < array[j - 1])
                {
                    SortingUtilities.swap(array, j, j - 1);
                }
                else
                {
                    break;
                }
            }
        }
    }

    public static void selectionSort(int[] array)
    {
        //for each index in the array
        for (int i = 0; i < array.length; i++)
        {
            //assume the current element is the smallest
            int smallest = array[i];
            int smallestIndex = i;

            //find any smaller element
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < smallest)
                {
                    smallest = array[j];
                    smallestIndex = j;
                }
            }

            //copy the smallest element into the next smallest index
            //in the array
            SortingUtilities.swap(array, i, smallestIndex);
        }
    }




































}  //basic sorts








