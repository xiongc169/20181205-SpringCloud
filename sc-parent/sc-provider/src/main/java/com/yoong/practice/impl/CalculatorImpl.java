package com.yoong.practice.impl;

import com.yoong.practice.api.ICalculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements ICalculator {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
