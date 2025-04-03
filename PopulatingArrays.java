import java.util.Arrays;
import java.util.Random;

/**
 * This is the package for PopulatingArrays.java
 *
 * The PopulatingArrays program makes 5 arrays.
 * For each array:
 * it displays an array of 10 integers,
 * displays the array in numerical order,
 * and the average in the console.
 *
 * <p>This class satisfies style checkers.</p>
 *
 * @version 1.0
 * @since 2025-03-18
 */

public final class PopulatingArrays {

    /**
     * The size of the array to be populated. */
    private static final int ARRAYSIZE = 10;

    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private PopulatingArrays() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args unused.
     */
    public static void main(final String[] args) {
        Random rand = new Random();
        int arrayOfInts[] = new int[ARRAYSIZE];
        int counter = 0;
        int sortedArray[] = new int[ARRAYSIZE];

        // loop to make array 5 different times
        while (counter < 5) {
            // populate array with random numbers
            for (int i = 0; i < ARRAYSIZE; i++) {
                arrayOfInts[i] = rand.nextInt(100);
            }
            // print number of array
            System.out.println("Array number: " + (counter + 1));
            // print array to console
            System.out.print("Original array: ");
            System.out.println(Arrays.toString(arrayOfInts));

            // sort array
            Arrays.sort(arrayOfInts);
            // puts sorted array into sortedArray
            for (int item = 0; item < ARRAYSIZE; item++) {
                sortedArray[item] = arrayOfInts[item];
            }

            // print sorted array to console
            System.out.println("Sorted array: " + Arrays.toString(sortedArray));

            // calculate average
            int sum = 0;
            for (int num = 0; num < ARRAYSIZE; num++) {
                sum += sortedArray[num];
            }
            System.out.println("Average = " + sum / ARRAYSIZE);

            // add counter
            counter = counter + 1;
        }
    }
}
