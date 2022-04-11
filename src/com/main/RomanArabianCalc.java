package com.main;


import java.util.Scanner;


public class RomanArabianCalc {
    static Scanner scanner = new Scanner(System.in);
    static int number1, number2;
    static char operation;
    static int result;

    public static void main (String[] args) {
        Calculated calculated = new Calculated();

        System.out.println("Введите выражение в формате 1+1 или I+I в дипазоне от 1 до 10");
        String userInput = scanner.nextLine();

        char[] under_char = new char[10];


        for (int i = 0; i < userInput.length(); i++) {
            under_char[i] = userInput.charAt(i);
            if (under_char[i] == '+') {
                operation = '+';
            }
            if (under_char[i] == '-') {
                operation = '-';
            }
            if (under_char[i] == '*') {
                operation = '*';
            }
            if (under_char[i] == '/') {
                operation = '/';
            }
        }


        String under_charString = String.valueOf(under_char);
        String [] blocks = under_charString.split("[+-/*]");
        String str0 = blocks[0];
        String str1 = blocks[1];
        String str3 = str1.trim();

        number1 = ConvertNumToRoman.romanToNumber(str0);
        number2 = ConvertNumToRoman.romanToNumber(str3);
        if(number1 < 0 && number2 < 0) {
            result = 0;
        }else {
            result = Calculated.calculated(number1, number2, operation);
            String resultRoman = ConvertNumToRoman.convertNumToRoman(result);
            System.out.println(str0 + " " + operation + " " + str3 + " = " + resultRoman);
        }

        number1 = Integer.parseInt(str0);
        number2 = Integer.parseInt(str3);
        result = Calculated.calculated(number1, number2, operation);
        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);




        }
    }




