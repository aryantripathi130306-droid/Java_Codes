public class Spynumber {
    public static void main(String[] args) {
        int num = 123;
        int sumOfDigits = 0;
        int productOfDigits = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            temp /= 10;
        }

        if (sumOfDigits == productOfDigits) {
            System.out.println(num + " is a spy number.");
        } else {
            System.out.println(num + " is not a spy number.");
        }
    }
}
