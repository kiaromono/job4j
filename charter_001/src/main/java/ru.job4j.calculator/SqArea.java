package ru;

public class SqArea {
    public static double square(int p, int k){
        int h = p / (2 * (k + 1));
        return (h * k) * h;
    }
    public static void main(String[] args) {
        System.out.println(" p = 6, k = 2, s = " + square(6,2));
    }
}

