import java.util.Scanner;
class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =sc.nextInt();
        int x= num;
        int rev=0;
        while(x!=0){
            int digit = x%10;
            rev = rev*10 + digit;
            x /=10;
        }
        if(num == rev){
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
        sc.close();

    }
}