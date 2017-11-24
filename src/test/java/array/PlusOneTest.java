package array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    private PlusOne plusOne;

    @Before
    public void setUp() throws Exception {
        plusOne = new PlusOne();
    }

    @Test
    public void testPlusOne_Zero() throws Exception {
        int[] given = {0};
        int[] expected = {1};

        assertArrayEquals(expected, plusOne.plusOne(given));
    }

    @Test
    public void testPlusOne_NineInLastPosition() throws Exception {
        int[] given = {4,5,8,5,2,1,9};
        int[] expected = {4,5,8,5,2,2,0};

        assertArrayEquals(expected, plusOne.plusOne(given));
    }

    @Test
    public void testPlusOne_RandomNumber() throws Exception {
        int[] given = {4,5,8,5,1,2};
        int[] expected = {4,5,8,5,1,3};

        assertArrayEquals(expected, plusOne.plusOne(given));
    }

    @Test
    public void testPlusOne_BigNumber() throws Exception {
        int[] given = {4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,
                4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2};
        int[] expected = {4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,
                4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,2,4,5,8,5,1,3};

        assertArrayEquals(expected, plusOne.plusOne(given));
    }
}