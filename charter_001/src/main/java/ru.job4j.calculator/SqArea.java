package ru;

public class SqArea {
    public static double square(int p, int k) {
        //int p = (2 * (k + 1) * h);
        int h = p / (2 * (k + 1));
        return h;
    }
    public static double area(int h, int k) {
        int S = (h * k) * h;
        return S;
    }
    public static void main(String[] args) {
        double result = square(6,2);
        double result3 = area(1, 2);
        System.out.println(" p = 6, k = 2, h = " + result + " area = " + result3);
    }
}
