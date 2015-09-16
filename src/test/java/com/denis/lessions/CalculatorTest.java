package com.denis.lessions;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSumm() throws Exception {
        Calculator calculator = new Calculator();
        calculator.summ(2, 5);
        Assert.assertEquals(7.0, calculator.getResult());
    }
}