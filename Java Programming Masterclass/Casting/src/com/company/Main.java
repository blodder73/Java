package com.company;

public class Main {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myMinShortValue = Short.MIN_VALUE;
        short myNewShortValue = (short) (myMinShortValue / 2);

        byte myByte = 111;
        short myShort = 11000;
        int myInt = 110110;
        long myLong = 50000L + (10 * (myByte + myShort + myInt));
        System.out.println("myByte = "  + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong is 50000 + 10 times the sum of myByte + myShort + myInt = " + myLong);
    }
}
