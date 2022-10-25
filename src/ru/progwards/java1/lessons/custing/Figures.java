package ru.progwards.java1.lessons.custing;

public class Figures {
    final static Double PI = 3.14;

    public static double circle(double r) {
        return PI * r * r;
    }
    public static double square(double n) {
        return n * n;
    }
    public static Double triangle(double k) {
        return (k * k * Math.sqrt(3)) / 4;
    }
    public static double squareVsTraiange(double p) {
        return square(p) / triangle(p);
    }
    public static double squareVsCircle(double p) {
        return square(p) / circle(p);
    }
    public static double triangleVsCircle(double p) {
        return triangle(p) / circle(p);
    }
}
