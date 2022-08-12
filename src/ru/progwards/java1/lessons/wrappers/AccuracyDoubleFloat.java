package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    final static Double PI_D = 3.14;
    final static Float PI_F = 3.14F;

    public static Double volumeBallDouble(Double radius) {
        return (4 * PI_D * radius * radius * radius) / 3;
    }
    public static Float volumeBallFloat(Float radius){
        return (4 * PI_F * radius * radius * radius) / 3;
    }

    public static Double calculateAccuracy(Double radius) {
        return volumeBallDouble(radius) - volumeBallFloat(radius.floatValue());
    }

    public static void main(String[] args) {
        System.out.println(calculateAccuracy(6371.2));
        System.out.println(calculateAccuracy(1.));
    }
}
