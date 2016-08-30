package com.yeep.test;

import org.junit.Test;
import com.yeep.Problems;
import static org.junit.Assert.*;

public class ProblemsTest {

    @Test
    public void test_1_8() throws Exception {

        int[][] array = {{0,2,3,1},{4,5,6,1},{7,8,0,1}};
        int[][] expected = {{0,0,0,0},{0,5,0,1},{0,0,0,0}};

        Problems problems = new Problems();

        assertEquals(expected,problems.lab_1_8(array));
    }
}