package com.company;
import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.0");
    public static void main(String[] args) {
        List<Function> functions = new ArrayList<>();

        functions.add(new LinearFunction(2,4));
        functions.add(new SquareFunction(2,0,-2.5));
        functions.add(new AbsoluteLinearFunction(2,4));

        List<Fun> funList = new ArrayList<>(functions);

        System.out.println("Original functions");
        funList.forEach(f -> System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));
        functions.forEach(f -> f.increaseCoefficientsBy(1.2));

        System.out.println("Functions increased by 1.2");
        funList.forEach(f -> System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));
        functions.forEach(f -> f.decreaseCoefficientsBy(1.2));

        System.out.println("Functions decreased by 1.2");
        funList.forEach(f -> System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));
        
        Fun fun = new Fun() {
            @Override
            public double f(double x) {
                return x*x*x;
            }
        };
        System.out.println("10^3 = " + fun.f(10));
        System.out.println("min(10,100,5) = " + Fun.minimum(new LinearFunction(5,21),10.0,100.0,5.0));
    }
}
