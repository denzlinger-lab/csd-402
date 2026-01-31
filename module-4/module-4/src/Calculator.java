/**
 *Abram Denzlinger
 * January 31, 2026
 * Assignment 4.2 - Single-Dimensional Arrays

 * This program demonstrates method overloading in Java.
 * It contains four overloaded 'average' methods that handle different
 * numeric array types (short, int, long, and double).

 * The main method serves as a test driver, passing arrays of various sizes
 * to each method to verify the logic and ensure correct type handling.
 **/

    void main(String[] args) {
        double[] doubleArray = {27.5, 32.3, 57.6, 40.0};
        int[] intArray = {10, 20, 40, 30, 75};
        short[] shortArray = {(short)9, (short)18, (short)27, (short)36};
        long[] longArray = {1200L, 2400L, 3600L, 4800L, 6000L};

        System.out.print("Array: " + java.util.Arrays.toString(doubleArray));
        System.out.println(" | Average (double): " + average(doubleArray));
        System.out.print("Array: " + java.util.Arrays.toString(intArray));
        System.out.println(" | Average (int): " + average(intArray));
        System.out.print("Array: " + java.util.Arrays.toString(shortArray));
        System.out.println(" | Average (short): " + average(shortArray));
        System.out.print("Array: " + java.util.Arrays.toString(longArray));
        System.out.println(" | Average (long): " + average(longArray));
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static short average(short[] array) {
        //using int type as the bucket here to avoid overflowing
        //the short type with very long arrays
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return (sum / array.length);
    }