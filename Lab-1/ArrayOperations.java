/**
Array Operations

Write a program with an array that is initialized with test data. Use any primitive data type of your choice. The program should also have the following methods:

    -getTotal. This method should accept a one-dimensional array as its argument and return the total of the values in the array.
    -getAverage. This method should accept a one-dimensional array as its argument and return the average of the values in the array.
    -getHighest. This method should accept a one-dimensional array as tis argument and return the highest value in the array.
    -getLowest. This method should accept a one-dimensional array as its argument and return the lowest value in the array.

Demonstrate each of the methods in the program.
*/


import java.util.Scanner;

public class ArrayOperations
{
    public static void main(String[] args) {
        int[] array = {2,4,5,6,7,8,9,12,10,14,20};

        //total
        System.out.printf("%s: %d\n", "Array total", ArrayOperations.getTotal(array));

        //average
        System.out.printf("%s: %d\n", "Array average", ArrayOperations.getAverage(array));

        //highest
        System.out.printf("%s: %d\n", "Array highest", ArrayOperations.getHighest(array));

        //lowest
        System.out.printf("%s: %d\n", "Array lowest", ArrayOperations.getLowest(array));
    }

    public static int getTotal(int[] array) {
        int total = 0;

        for(int i = 0; i < array.length; i++) {
            total+=array[i];
        }

        return total;
    }

    public static int getAverage(int[] array) {
        int average, total = 0;

        for(int i = 0; i < array.length; i++) {
            total+=array[i];
        }

        average = total / array.length;

        return average;
    }

    public static int getHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            if(highest >= array[i]) {
                continue;
            }
            highest = array[i];
        }

        return highest;
    }

    public static int getLowest(int[] array) {
        int lowest = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            if(lowest <= array[i]) {
                continue;
            }
            lowest = array[i];
        }
        
        return lowest;
    }
}
