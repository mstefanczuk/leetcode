package array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @Before
    public void setUp() throws Exception {
        removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void testRemoveDuplicates() throws Exception {
        int[] nums1 = {1, 2, 2, 3};
        int expectedLength1 = 3;

        assertEquals(removeDuplicatesFromSortedArray.removeDuplicates(nums1), expectedLength1);

        int[] nums2 = {1, 1, 1, 1, 2, 3, 5, 5, 5, 6, 6, 7, 7};
        int expectedLength2 = 6;

        assertEquals(removeDuplicatesFromSortedArray.removeDuplicates(nums2), expectedLength2);
    }

}