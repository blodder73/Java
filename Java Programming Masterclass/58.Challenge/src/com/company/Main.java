package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(13, 12);
//        calcFeetAndInchesToCentimeters(13.7);
//        calcFeetAndInchesToCentimeters(26);
//        calcFeetAndInchesToCentimeters(26.7);
//        calcFeetAndInchesToCentimeters(72);
//        calcFeetAndInchesToCentimeters(6, 0);
//        calcFeetAndInchesToCentimeters(7, 5);
//        calcFeetAndInchesToCentimeters(-10, 1);
//        calcFeetAndInchesToCentimeters(0, 1);
//        calcFeetAndInchesToCentimeters(10, -1);
//        calcFeetAndInchesToCentimeters(10, 13);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid Feet or Inches");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainder = inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainder);
        return calcFeetAndInchesToCentimeters(feet, remainder);
    }
}
