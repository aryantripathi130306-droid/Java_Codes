public class Butterflypattern {
    public static void main(String[] args) {
        int rows = 5;

        // Upper half of the butterfly
        for (int i = 1; i <= rows; i++) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print(" ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = rows; i >= 1; i--) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print(" ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
