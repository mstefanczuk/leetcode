package array;

import java.util.HashMap;
import java.util.Map;

/*
* Source: https://leetcode.com/problems/two-sum
*
* Solution description:
* First of all, let's create HashMap to store integer value as a key and its index as a value.
* Then we iterate through array of integers. For each element we calculate complement which is  target - nums[i].
* And if our map contains key which is some element's value equal to complement, then we have our result which is array
* of indexes (value of element we found and actual loop index).
* If map doesn't contain the wanted key, we just put new pair in map which is (actual integer, it's index).
* */

class No1TwoSum {

    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
