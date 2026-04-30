public class arraybound {
    public static void main(String[] args) {
        int [] arr = {10,20,30};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
         finally {
            System.out.println("This block will always execute.");
        }
    
    }
}
