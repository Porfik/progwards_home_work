package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int unit, ten, hundred, result;

        unit = number % 10;
        ten = (number / 10) % 10;
        hundred = number / 100;

        result = unit * 100 + ten * 10 + hundred;

        return result;
    }

    //Реализовал функцию для удобного тестирования.
    public static void reverseDigitsTestFn(int inputVal, int correctVal) {
        int outputVal = reverseDigits(inputVal);

        if (outputVal == correctVal) {
            System.out.println("Test with value " + inputVal + " passed.");
        }
        else {
            System.out.println("Error, test with value " + inputVal + " failed. The output value of function " + outputVal + ".");
        }
    }

    public static void main(String[] args) {
        reverseDigitsTestFn(123, 321);
        reverseDigitsTestFn(563, 365);
        reverseDigitsTestFn(914, 419);
        reverseDigitsTestFn(302, 203);

        //Функции ниже нужны для проверки функции тестирования
        reverseDigitsTestFn(126, 612);
        reverseDigitsTestFn(1242, 2421);
    }
}
