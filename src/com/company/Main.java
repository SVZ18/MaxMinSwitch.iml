package com.company;

public class Main {

    public static void main(String[] args) {
        double firstValue;
        double secondValue;
        double answer;

        firstValue = 5;
        secondValue = 1;
        String operator = "min";

        System.out.println(doArithmetic(firstValue, secondValue, operator));



    }

    public static double doArithmetic(double firstNumber, double secondNumber, String operator) {
        double answer = 0;
        switch (operator) {
            case "max":
                answer = Math.max(firstNumber, secondNumber);
                System.out.println(answer);
                return answer;
            case "min":
                answer = Math.min(firstNumber, secondNumber);
                System.out.println(answer);
        }

        return answer;
    }

}
