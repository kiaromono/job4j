package ru;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return  (value / 60);
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
       /* int euro = rubleToEuro(140);
        int dollar = rubleToDollar( 180);
        int ruble = euroToRuble(2);
        int ruble1 = dollarToRuble(3);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar");
        System.out.println("2 euro are " + ruble + " ruble");
        System.out.println("3 dollars are " + ruble1 + " ruble"); */
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in1 = 180;
        int expected1 = 3;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("180 rubles are 3. Test result : " + passed1);
       
        int in2 = 2;
        int expected2 = 140;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("2 euro are 140. Test result : " + passed2);

        int in3 = 3;
        int expected3 = 180;
        int out3 = dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("3 dollars are 180. Test result : " + passed3);
    }
}
