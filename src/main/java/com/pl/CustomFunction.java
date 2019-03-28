package com.pl;

import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class CustomFunction {

    public static Double polynomial(Double x) {

        return 3 * pow(x, 3) * 4 * pow(x, 2) * 2 * x;
    }

    public static Double trigonometric(Double x){

        return 1/2*sin(x);
    }

    public static Double exponential(Double x){

        return pow(2, x);
    }
}
