public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        System.out.println("Second number: " + mySecondNumber + ". Third number: " + myThirdNumber);
        int myTotal = myFirstNumber + myThirdNumber + mySecondNumber;
        System.out.println("Total first, second and third: " + myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println("Total: " + myLastOne);
    }
}
