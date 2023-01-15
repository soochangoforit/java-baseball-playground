package study;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int remainder(int a, int b) {
        return a % b;
    }

    public int calculate(String input) {

        String[] values = split(input);

        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i++) {
            String value = values[i];

            result = getResult(values, result, i, value);
        }

        return result;
    }

    private int getResult(String[] values, int result, int i, String value) {
        if (isOperator(value)) {
            int next = Integer.parseInt(values[i + 1]);
            result = operate(result, value, next);
        }
        return result;
    }

    private int operate(int result, String value, int next) {
        if ("+".equals(value)) {
            result = add(result, next);
        }
        if ("-".equals(value)) {
            result = subtract(result, next);
        }
        if ("*".equals(value)) {
            result = multiply(result, next);
        }
        if ("/".equals(value)) {
            result = divide(result, next);
        }
        if ("%".equals(value)) {
            result = remainder(result, next);
        }
        return result;
    }

    private boolean isOperator(String value) {
        return value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/") || value.equals("%");
    }

    private static String[] split(String line) {
        String[] values = line.split(" ");
        return values;
    }

    private String scanFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }


}
