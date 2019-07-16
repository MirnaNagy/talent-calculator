package com.sumerge.grad.program.calculator;

import org.graalvm.compiler.core.amd64.AMD64ArithmeticLIRGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        Assert.assertThat(calculator.add(1.0, 2.0), equalTo(3.0));
    }

    @Test
    public void subtract() {
        Assert.assertThat(calculator.subtract(5.0, 2.0), equalTo(3.0));
    }

    @Test
    public void multiply() {
        Assert.assertThat(calculator.multiply(1.5, 2.0), equalTo(3.0));
    }

    @Test
    public void divide() {
        Assert.assertThat(calculator.divide(10.0, 2.0), equalTo(5.0));
    }

    @Test
    public void dividePositiveByZero(){Assert.assertThat(calculator.divide(20.0, 0.0), equalTo(Double.POSITIVE_INFINITY));}

    @Test
    public void divideNegativeByZero(){Assert.assertThat(calculator.divide(-20.0, 0.0), equalTo(Double.NEGATIVE_INFINITY));}
}