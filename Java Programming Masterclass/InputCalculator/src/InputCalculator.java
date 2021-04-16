import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        long avg = 0;
        boolean first = true;

        while(true) {

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();

                if(first){
                    first = false;
                    sum = 0;
                }

                counter++;
                sum += number;
                avg = Math.round((double)sum / counter);

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
