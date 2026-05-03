public class Count_even_number {
    public static void main(String[] args) {
        int arr[]={99,88,79,68,59,48,39,28,19,10};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("The count of even numbers is: "+count);
    }
}
