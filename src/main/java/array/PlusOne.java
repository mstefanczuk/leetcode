package array;

/*
* Source: https://leetcode.com/problems/plus-one/
*
* Solution description:
* This is very simple solution. We start iterating with the last element from the array.
* In every iteration we check if the digit is 9 and if not, we increase it by one and return the array.
* If the number is not 9, we set element value as 0 and continue the loop.
* If the loop is executed, we will return new array with 1 as its first element and with zeros as rest of the array.
* Its length is input length plus one.
* */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class PlusOne {

    int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    /*
    * Solution below doesnt work for big numbers (greater than max int).
     */
    int[] plusOneNotForBigNumbers(int[] digits) {
        int integer = Integer.valueOf(IntStream.of(digits)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining("")));

        integer++;

        return Integer.toString(integer).chars().map(c -> c -= '0').toArray();
    }

}