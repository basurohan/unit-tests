package com.example.unittesting.business;

import java.util.Arrays;

public class SomeBusinessImpl {

    public int sum(int[] data) {
        return Arrays.stream(data)
                .reduce(0, Integer::sum);
    }

}
