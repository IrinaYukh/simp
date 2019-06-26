package app_class;

import java.util.Date;

import static app_class.Calculator.*;

// Remote Repository change
public class Main {

    public static void main(String[] args) {
        int result;
        int firstNum = 8;
        int secondNum = 4;
        int thirdNum = 0;

        result = addNumbers(firstNum, secondNum);
        System.out.println(result);
        result = subtractNumbers(firstNum, secondNum);
        System.out.println(result);
        result = divideNumbers(firstNum, secondNum);
        System.out.println(result);
        result = multiplyNumbers(firstNum, secondNum);
        System.out.println(result);

        System.out.println("===========================");

        System.out.println(addNumbers(firstNum, secondNum));
        System.out.println(subtractNumbers(firstNum, secondNum));
        System.out.println(divideNumbers(firstNum, secondNum));
        System.out.println(multiplyNumbers(firstNum, secondNum));
        System.out.println(divideNumbers(firstNum, thirdNum));


        Date date = new Date();
        System.out.println(date);
    }

}
