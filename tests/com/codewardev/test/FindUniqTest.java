package com.codewardev.test;

// https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewardev.Kata;

class FindUniqTest {

	private double precision = 0.0000000000001;
    
    @Test
    public void sampleTestCases() {
        assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }

}
