public class bitwise {
    public static void main(String[] args){
        int a=5; // 0101 in binary
        int b=3; // 0011 in binary
        int and=a&b; // bitwise AND
        int or=a|b; // bitwise OR
        int xor=a^b; // bitwise XOR
        int not_a=~a; // bitwise NOT
        System.out.println("Bitwise AND of a and b is: "+and);
        System.out.println("Bitwise OR of a and b is: "+or);
        System.out.println("Bitwise XOR of a and b is: "+xor);
        System.out.println("Bitwise NOT of a is: "+not_a);
    }
    
}
