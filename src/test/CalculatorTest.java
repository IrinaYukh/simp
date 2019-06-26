package test;

import app.Calculator;
import app.DateTool;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class CalculatorTest {

    int firstNum = 8;
    int secondNum = 4;
    int thirdNum = 0;

    @Test
    public void calculationsTest() {
        Assert.assertEquals(1, 1);
        Assert.assertEquals(12, Calculator.addNumbers(firstNum, secondNum));
        Assert.assertEquals(4, Calculator.subtractNumbers(firstNum, secondNum));
        Assert.assertEquals(2, Calculator.divideNumbers(firstNum, secondNum));
        Assert.assertEquals(32, Calculator.multiplyNumbers(firstNum, secondNum));
        Assert.assertEquals(-1, Calculator.divideNumbers(firstNum, thirdNum));
    }

    @Test
    public void negativeCalculatorTest() {
        Assert.assertNotEquals(11, Calculator.addNumbers(firstNum, secondNum));
        Assert.assertNotEquals(2, Calculator.subtractNumbers(firstNum, secondNum));
        Assert.assertNotEquals(5, Calculator.divideNumbers(firstNum, secondNum));
        Assert.assertNotEquals(1, Calculator.multiplyNumbers(firstNum, secondNum));
        Assert.assertNotEquals(5, Calculator.divideNumbers(firstNum, thirdNum));
    }

    @Test
    public void formatDatesTest() {
        Date resultDate;

        resultDate = DateTool.addHoursToNow(1);
        System.out.println(resultDate);

        resultDate = DateTool.addMinuteToNow(5);
        System.out.println(resultDate);

        resultDate = DateTool.addDayToNow(30);
        System.out.println(resultDate);

    }
}

