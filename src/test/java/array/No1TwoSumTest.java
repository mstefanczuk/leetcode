package array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class No1TwoSumTest {

    private No1TwoSum no1TwoSum;

    @Before
    public void setUp() throws Exception {
        no1TwoSum = new No1TwoSum();
    }

    @Test
    public void testTwoSum() throws Exception {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        assertArrayEquals(expected, no1TwoSum.twoSum(nums, target));
    }

}