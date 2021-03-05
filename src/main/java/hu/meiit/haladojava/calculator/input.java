package hu.meiit.haladojava.calculator;

import java.util.Scanner;

public class input {

    private static String getExpressionFromStdin(){
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        return  expression;
    }
    public static void assertExpression(String[] parts ) throws Exception{

        if (parts.length != 3) {
            throw new Exception("wrong input");
        }
    }
}
