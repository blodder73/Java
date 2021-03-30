package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for(int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("\n");

        for(int j = 8; j > 1; j--){
            System.out.println("10,000 at " + j + "% interest = " + String.format("%.2f",calculateInterest(10000.0, j)));
        }

        System.out.println("\n");

        int primes = 0;
        for(int i = 10; i < 50; i++){

            if(isPrime(i)){
                System.out.println(i + " is a prime? " + isPrime(i));
                primes++;
                if(primes == 3){
                    break;
                }
            }
        }


    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
