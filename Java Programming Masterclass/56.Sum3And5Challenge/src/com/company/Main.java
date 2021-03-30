package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
	    for(int range = 1; range < 1001; range++){
	        if(range % 3 == 0 && range % 5 == 0) {
                System.out.println(range + " can be divided by 3 and 5");
	            sum += range;
	            total++;
	            if(total == 5){
                    System.out.println("Total = " + sum);
	                break;
                }
            }
        }
    }
}
