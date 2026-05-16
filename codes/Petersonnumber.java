public class Petersonnumber {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int sumOfFactorials = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }

        if (sumOfFactorials == num) {
            System.out.println(num + " is a Peterson number.");
        } else {
            System.out.println(num + " is not a Peterson number.");
        }
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
