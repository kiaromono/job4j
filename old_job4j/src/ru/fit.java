package ru;

public class fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(180);
        double woman = womanWeight(180);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 110 is " + woman);
    }

}
