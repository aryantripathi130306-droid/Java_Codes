public class Harshadnumber {
    public static void main(String[] args) {
        int num = 18;
        int sumOfDigits = 0;
        int temp = num;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (num % sumOfDigits == 0) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }
    }
}
