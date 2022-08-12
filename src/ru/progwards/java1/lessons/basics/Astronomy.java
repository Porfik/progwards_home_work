package ru.progwards.java1.lessons.basics;

public class Astronomy {
    final static float PI = 3.14F;

    public static Double sphereSquare(Double r) {
        double square = 4 * PI * (r * r);

        return square;
    }

    public static Double earthSquare() {
        return sphereSquare(6371.2);
    }
    public static Double mercurySquare() {
        return sphereSquare( 2439.7);
    }
    public static Double jupiterSquare() {
        return sphereSquare(71492.0);
    }

    public static Double earthVsMercury() {
        double earth = earthSquare(), mercury = mercurySquare();

        return earth / mercury;
    }
    public static Double earthVsJupiter() {
        double earth = earthSquare(), jupiter = jupiterSquare();

        return earth / jupiter;
    }

    public static void main(String[] args) {
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }
}
