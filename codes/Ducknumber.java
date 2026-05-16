public class Ducknumber {
    public static void main(String[] args) {
        int num = 1023;
        String numStr = Integer.toString(num);
        boolean isDuck = true;

        for (char digit : numStr.toCharArray()) {
            if (digit == '0') {
                isDuck = false;
                break;
            }
        }

        if (isDuck) {
            System.out.println(num + " is a duck number.");
        } else {
            System.out.println(num + " is not a duck number.");
        }
    }
}
