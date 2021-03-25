package com.company;

import java.util.TooManyListenersException;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println(result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("1 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an alien");

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 91;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        double firstDouble = 20.00D;
        double secondDouble = 80.00;
        double totalDouble = (firstDouble + secondDouble) * 100;
        System.out.println(totalDouble);
        double theRemainder = totalDouble % 40.00d;
        System.out.println(theRemainder);
        totalDouble = 40.00d % 3;
        System.out.println(totalDouble);
        if (totalDouble == 0) {
            System.out.println("totaldouble is equal to 0");
        }
        else {
            System.out.println("Got some remainder");
        }
        System.out.println("The end");

    }
}
