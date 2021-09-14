package Figire;

import org.junit.jupiter.api.function.Executable;

public class Calculator {
    public static void calculate(int val1, String operator, int val2) {
    }

        public static void calculate(String[] args) {
        if (args.length < 3) {
            System.out.println("You need to add two numbers and sign only");
            System.exit(1);
            return ;
        }

        var isVal1Int = isInt(args[0]);
        if (!isVal1Int) {
            System.out.println("Only numbers");
            System.exit(2);
            return ;
        }

        var isVal2Int = isInt(args[2]);
        if (!isVal2Int) {
            System.out.println("Only numbers");
            System.exit(3);
            return ;
        }

        var val1 = Integer.parseInt(args[0]);
        var operator = args[1];
        var val2 = Integer.parseInt(args[2]);
        var result = 0;

        if (!("+".equals(operator) ||
                "/".equals(operator) ||
                "*".equals(operator) ||
                "-".equals(operator))) {

            System.out.println("Only +, -, *, /");
            System.exit(4);
            return;
        }

        switch (operator) {
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            case "/":
                result = val1 / val2;
        }
    }

    private static boolean isInt(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
