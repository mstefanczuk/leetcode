package array;



/*
* Source: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*
* Solution description:
* We iterate through the whole loop starting with second element.
* If array length is 0 or 1, then we just do not get into the loop and return given length.
* If length is greater than 1, we start with second element and compare it with previous one.
* And while there is duplicate of previous item, we just skip this element and decrease length to be returned.
* For this is j variable, which is help variable to skip these duplicates.
* And if nums[j] is not duplicate of our previous (nums[i-1]) element, we place the nums[j] element into the
* nums[i] place.
* */

class RemoveDuplicatesFromSortedArray {

    int removeDuplicates(int[] nums) {

        int newLength = nums.length;
        int j = 0;

        for(int i = 1; i < nums.length; i++) {
            j++;
            while(j < nums.length && nums[i-1] == nums[j]) {
                newLength--;
                j++;
            }

            if(j < nums.length)
                nums[i] = nums[j];
        }

        return newLength;
    }

    /*
     * In below solution we replace elements until the end of array is reached.
     */
    int removeDuplicatesSlowVersion(int[] nums) {
        int newLength = nums.length;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            } else {
                newLength--;
            }
        }
        return newLength;
    }
}
