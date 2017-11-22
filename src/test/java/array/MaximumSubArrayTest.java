package array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubArrayTest {

    private MaximumSubArray maximumSubArray;

    @Before
    public void setUp() {
        maximumSubArray = new MaximumSubArray();
    }

    @Test
    public void maximumSubarrayTest() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expectedMaxSum = 6;

        assertEquals(maximumSubArray.maxSubArray(nums), expectedMaxSum);
    }
}