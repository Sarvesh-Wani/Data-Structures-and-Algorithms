package maths;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        /*
         * Prime numbers are only divisible by 1 and number itself
         * so simply check that if divisors of number from 1 to n are 2 then prime else not prime*/
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        if (count == 2) return true;
        return false;
    }

    public static boolean isPrimeOptimal(int n) {
        int count = 0;
        /*why square root of n --> as if factors present then one must need to be less than sqrt n*/
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 2;
        System.out.println(isPrime(n));
        System.out.println(isPrimeOptimal(n));
    }
}
