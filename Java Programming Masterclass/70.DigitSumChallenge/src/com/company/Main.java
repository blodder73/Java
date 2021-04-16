package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(15));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(12511));
        System.out.println(sumDigits(125111));
        System.out.println(sumDigits(1251111));
    }
    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        } else {
            int sum = 0;
            while(number > 0) {
                 sum = sum + number % 10;
                 number = number /10;
            }
            return sum;
        }
    }
}
