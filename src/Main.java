/**
 *Description: Driver and bubble sort class
 *Class: Spring - COSC 2436.83448
 *Assignment8: Bubble Sort
 *Date: 05/12/2019
 *@author  Ban Carpenter
 *@version 0.0.1

 */
public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[]{5, 6, 7, 1, 8, 4, 9, 2, 3};//general test array
        ArraySorts arrayWork = new ArraySorts(intArray);
        int arrayLength = intArray.length;
        arrayWork.bubbleSort(arrayLength);

    }
}
