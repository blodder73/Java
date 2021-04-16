public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number <= 0) {
            return -1;
        }
        int max_prime = -1;
        while (number % 2 == 0) {
            max_prime = 2;
            number >>= 1;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2){
            while (number % i == 0){
                max_prime = i;
                number = number / i;
            }
        }
        if (number > 2)
            max_prime = number;
        return max_prime;

    }
}
