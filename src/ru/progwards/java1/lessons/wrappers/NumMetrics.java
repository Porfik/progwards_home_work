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

    public static void sumDigitsTestFn(int inputVal, int correctVal) {
        int outputVal = sumDigits(inputVal);

        if (outputVal == correctVal) {
            System.out.println("Test with value " + inputVal + " passed.");
        }
        else {
            System.out.println("Error, test with value " + inputVal + " failed. The output value of function " + outputVal + ".");
        }
    }
    public static void mulDigitsTestFn(int inputVal, int correctVal) {
        int outputVal = mulDigits(inputVal);

        if (outputVal == correctVal) {
            System.out.println("Test with value " + inputVal + " passed.");
        }
        else {
            System.out.println("Error, test with value " + inputVal + " failed. The output value of function " + outputVal + ".");
        }
    }

    public static void main(String[] args) {
        sumDigitsTestFn(123, 6);
        sumDigitsTestFn(682, 16);
        sumDigitsTestFn(937, 19);
        //Функции ниже нужны для проверки функции тестирования
        sumDigitsTestFn(9371, 20);
        sumDigitsTestFn(602, 16);

        mulDigitsTestFn(123, 6);
        mulDigitsTestFn(413, 12);
        mulDigitsTestFn(846, 192);
        //Функции ниже нужны для проверки функции тестирования
        mulDigitsTestFn(8461, 192);
        mulDigitsTestFn(423, 12);
    }
}
