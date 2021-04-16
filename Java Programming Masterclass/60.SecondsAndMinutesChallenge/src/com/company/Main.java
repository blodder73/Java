package com.company;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(630));
        System.out.println(getDurationString(59));
        System.out.println(getDurationString(3601));
        System.out.println(getDurationString(3700));
        System.out.println(getDurationString(8000));
        System.out.println(getDurationString(59));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(3661));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(-1, 60));
        System.out.println(getDurationString(60, -1));
        System.out.println(getDurationString(65, 9));
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;

        String hoursZero = hours + "h";
        String minutesZero = remainderMinutes + "m";
        String secondsZero = seconds + "s";

        if(hours < 10) {
            hoursZero = ("0" + hoursZero);
        }
        if (remainderMinutes < 10) {
            minutesZero = ("0" + minutesZero);
        }
        if (seconds < 10) {
            secondsZero = ("0" + secondsZero);
        }

        return (hoursZero + " " + minutesZero + " " + secondsZero + "");
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        return getDurationString(minutes, remainderSeconds);
    }
}
