public class Twinprimenumbers {
    public static void main(String[] args) {
        int lower = 1, upper = 100;
        System.out.println("Twin prime numbers between " + lower + " and " + upper + " are:");
        for (int num = lower; num <= upper - 2; num++) {
            if (isPrime(num) && isPrime(num + 2)) {
                System.out.println("(" + num + ", " + (num + 2) + ")");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false; // Skip numbers less than 2
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
