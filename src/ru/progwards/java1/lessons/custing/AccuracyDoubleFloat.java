package ru.progwards.java1.lessons.custing;

public class AccuracyDoubleFloat {
    public static double calculateAccuracy(){
        double d = (double) 1 / (double) 3;
        float f = (float) d;

        return d - (double) f;
    }

    public static void main(String[] args) {
        System.out.println(calculateAccuracy());
    }
}
