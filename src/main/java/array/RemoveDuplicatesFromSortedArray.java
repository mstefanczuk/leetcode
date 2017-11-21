package array;



/*
* Source: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*
* Solution description:
* Our "new array" will be first newLength-1 elements of input array, so we just have to modify the beginning of the
* input array.
* We create variable j, which will be index of the "new array" - an array with duplicates removed.
* We start with second element and iterate trough whole array. If the current i-element is a duplicate of the
* previous one, we just do nothing and continue. And if they are not duplicates, we place current element on the
* j-index place and increase j by one. This increased j is going to be the new length of the "new array". And that's it.
* */

class RemoveDuplicatesFromSortedArray {

    int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
