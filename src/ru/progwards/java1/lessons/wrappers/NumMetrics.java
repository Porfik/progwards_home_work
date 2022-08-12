package ru.progwards.java1.lessons.wrappers;

public class NumMetrics {
    public static Integer sumDigits(Integer number) {
        int unit, ten, hundred, result;

        unit = number % 10;
        ten = (number / 10) % 10;
        hundred = number / 100;

        result = hundred + ten + unit;

        return result;
    }
    public static Integer mulDigits(Integer number) {
        int unit, ten, hundred, result;

        unit = number % 10;
        ten = (number / 10) % 10;
        hundred = number / 100;

        result = hundred * ten * unit;

        return result;
    }
}
