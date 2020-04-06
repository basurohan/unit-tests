package com.example.unittesting.business;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessImplTest {

    @Test
    public void sum() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        int result = business.sum(new int[] {1, 2, 3});

        assertEquals(6, result);
    }
}