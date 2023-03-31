package com.iKeeper.Day1;

class Calculator {
    public static int calculate(String expression) {
        char[] tokens = expression.toCharArray();
        int n = 0;
        int m = 0;
        char operator = '\0';
        int result = 0;
        for (char c : tokens) {
            if (Character.isDigit(c)) {
                if (operator == '\0') {
                    n = n * 10 + Character.getNumericValue(c);
                } else {
                    m = m * 10 + Character.getNumericValue(c);
                }
            } else {
                if (operator == '\0') {
                    operator = c;
                } else {
                    n = calculate(n, m, operator);
                    m = 0;
                    operator = c;
                }
            }
        }
        result = calculate(n, m, operator);
        return result;
    }

    private static int calculate(int n, int m, char operator) {
        switch (operator) {
            case '+':
                return n + m;
            case '-':
                return n - m;
            case '*':
                return n * m;
            case '/':
                if (m == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                } else {
                    return n / m;
                }
            default:
                System.out.println("올바른 연산이 아닙니다.");
                return 0;
        }
    }
}