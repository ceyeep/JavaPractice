package com.yeep.test;

import org.junit.Test;
import com.yeep.Problems;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class ProblemsTest {

    @Test
    public void test_1_8() throws Exception {

        int[][] array = {{0, 2, 3, 1}, {4, 5, 6, 1}, {7, 8, 0, 1}};
        int[][] expected = {{0, 0, 0, 0}, {0, 5, 0, 1}, {0, 0, 0, 0}};

        assertEquals(expected, Problems.lab_1_8(array));
    }

    @Test
    public void test_1_9_1() throws Exception {
        String original = "waterbottle";
        String rotated = "erbottlewat";

        assertTrue(Problems.lab_1_9(original, rotated));
    }

    @Test
    public void test_1_9_2() throws Exception {
        String original = "abc";
        String rotated = "bca";

        assertTrue(Problems.lab_1_9(original, rotated));
    }

    @Test
    public void test_1_9_3() throws Exception {
        String original = "abc";
        String rotated = "cba";

        assertFalse(Problems.lab_1_9(original, rotated));
    }

    @Test
    public void test_2_1() throws Exception {
        Integer[] originalValues = {3, 5, 6, 5, 1, 2, 3};
        Integer[] formattedValues = {3, 5, 6, 1, 2};
        LinkedList<Integer> originalList = new LinkedList<>();
        for(int value : originalValues)
            originalList.add(value);
        assertArrayEquals(formattedValues,Problems.lab_2_1(originalList).toArray());
    }

    @Test
    public void test_2_2_1() throws Exception {
        Integer[] originalValues = {3, 5, 6, 5, 1, 2, 3};
        LinkedList<Integer> originalList = new LinkedList<>();
        for(int value : originalValues)
            originalList.add(value);
        assertEquals(1,Problems.lab_2_2(originalList,3));
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void test_2_2_2() {
        Integer[] originalValues = {3, 5, 6, 5, 1, 2, 3};
        LinkedList<Integer> originalList = new LinkedList<>();
        for(int value : originalValues)
            originalList.add(value);
        assertEquals(1,Problems.lab_2_2(originalList,10));
    }
}