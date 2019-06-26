package app_class;

public class Calculator {

    public static int addNumbers(int numOne, int numTwo)
    {
        return numOne + numTwo;
    }

    public static int subtractNumbers(int numOne, int numTwo)
    {
        return numOne - numTwo;
    }

    public static int divideNumbers(int numOne, int numTwo)
    {
        if(numTwo != 0) {
            return numOne / numTwo;
        }
        return -1;
    }

    public static int multiplyNumbers(int numOne, int numTwo)
    {
        return numOne * numTwo;
    }




}

