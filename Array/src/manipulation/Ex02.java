package manipulation;

import utils.ArrayUtils;
import utils.Value;

/*
    - Calculate sum of odd number
    - Find max,min in one loop
    - Add element to index k
    - Remove element from index k
    - Update Element at index k
    - Reverse an array
 */
public class Ex02 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 7, 6, 4, 5, 9, 8};
        //Calculate sum of odd number
        System.out.println("Sum of odd numbers" + sum(numbers));
        // Find max,min in one loop
        System.out.println(maxMin(numbers));
        // Add element to index k
        int[] added = add(numbers, 3, 100);
        ArrayUtils.printf(added);
        //Remove element from index k
        int[] removed = remove(numbers, 3);
        System.out.println();
        ArrayUtils.printf(removed);
        //Update Element at index k
        int[] updated = update(numbers, 3, 10000);
        System.out.println();
        ArrayUtils.printf(updated);
        System.out.println();
        System.out.println();
        // Reverse
        int[] reversed = reverse(numbers);
        ArrayUtils.printf(reversed);


    }

    public static int[] reverse(int[] numbers) {
        int[] result = new int[numbers.length];
        for(int i =0; i<result.length; i++){
            result[i]= numbers[numbers.length-1 -i];
        }
        return result;
    }

    public static int[] update(int[] numbers, int index, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (i == index) {
                numbers[i] = value;
            }
        }
        return numbers;
    }

    public static int[] remove(int[] numbers, int index) {
        int[] results = new int[numbers.length - 1];
        for (int i = 0; i < results.length; i++) {
            if (i < index) {
                results[i] = numbers[i];
            }
            if (i >= index) {
                results[i] = numbers[i + 1];
            }
        }

        return results;

    }

    public static int[] add(int[] numbers, int index, int value) {
        int[] results = new int[numbers.length + 1];
        for (int i = 0; i < results.length; i++) {
            if (i < index) {
                results[i] = numbers[i];
            }
            if (i == index) {
                results[i] = value;
            }
            if (i > index) {
                results[i] = numbers[i - 1];
            }
        }
        return results;
    }

    public static Value maxMin(int[] numbers) {
        int max = 0;
        int min = 0;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        return new Value(max, min);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }

}
