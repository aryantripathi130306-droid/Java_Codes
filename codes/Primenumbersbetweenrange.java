public class Primenumbersbetweenrange {
    public static void main(String[] args) {
        int lower = 10, upper = 50;
        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        for (int num = lower; num <= upper; num++) {
            boolean isPrime = true;
            if (num < 2) {
                continue; // Skip numbers less than 2
            }
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
