public class Armstrong {
    public static void main(String[] args){
        int num =153;
        int org_num=num;
        int rem=0;
        int result=0;
        while(org_num!=0){
            rem=org_num%10;
            result=result+rem*rem*rem;
            org_num=org_num/10;
        }
        if(result==num){
            System.out.println(num+" is an Armstrong number.");
        }
        else{
            System.out.println(num+" is not an Armstrong number.");
        }
    }
    
}
