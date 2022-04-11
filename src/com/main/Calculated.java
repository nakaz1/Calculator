package com.main;

import java.util.InputMismatchException;

public class Calculated  extends  ConvertNumToRoman{

    public static int calculated (int num1, int num2, char op) {
        int result = 0;
        if(num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10) {
            result = num1 + num2;
        } else {
            System.out.println("Введите в диапазоне от 1 до 10");
            return result = 0;
        }

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    result = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Exception : " + e);
                    System.out.println("Введите целое число");

                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Неверный знак операции");
        }

        return result;
    }
}
