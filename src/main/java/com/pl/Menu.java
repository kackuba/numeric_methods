package com.pl;

import java.util.Scanner;

import static java.lang.System.out;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);
    private static Double a;
    private static Double b;
    private static Integer iterationNumber;
    private static Double epsilon;
    private static String chosedFunction;

    public static void main(String[] args) {
        decisions();
    }

    private static void decisions() {
        setParams();
        if (chosedFunction.equals("p")) {
        } else if (chosedFunction.equals("t")) {
        } else if (chosedFunction.equals("e")) {
        } else {
            out.println("Sorry, 404 Error");
        }
    }

    private static void setParams() {
        choseFunction();
        setInterval();
        if (choseStrategy()) {
            setEpsilon();
        } else {
            setNumberOfIterations();
        }
    }

    private static void choseFunction() {
        out.println("Choose function, press: " +
                "\n p - polynomial" +
                "\n t - trigonometric" +
                "\n e - exponential");

        chosedFunction = scanner.nextLine();
    }

    private static Boolean choseStrategy() {

        out.println("Set precision, press 0" +
                "\n OR" +
                "\n Set number of iterations, press 1");
        Integer temp = scanner.nextInt();
        if (temp == 0) {
            return true;
        } else if (temp == 1) {
            return false;
        }
        return null;
    }

    private static void setEpsilon() {
        out.println("Set epsilon");
        out.println("epsilon= ");
        epsilon = scanner.nextDouble();
    }

    private static void setNumberOfIterations() {
        out.println("Give max value od iteration: ");
        out.println("a= ");
        a = scanner.nextDouble();
    }

    private static void setInterval() {
        out.println("Give interval: ");
        out.println("a= ");
        a = scanner.nextDouble();
        out.println("b= ");
        b = scanner.nextDouble();
    }

    private static void calc(Double function) {

        while (function > epsilon && a != b) {
            Double temp = (a + b) / 2.0;
            if (function + function < 0) {
                b = temp;
            }
        }
    }
}
