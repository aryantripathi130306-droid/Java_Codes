public class Automorphicnumber {
    public static void main(String[] args) {
        int num = 25;
        int square = num * num;
        String numStr = Integer.toString(num);
        String squareStr = Integer.toString(square);

        if (squareStr.endsWith(numStr)) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }
    }
}
