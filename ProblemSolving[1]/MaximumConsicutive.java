
import java.util.Scanner;

class MaximumConsicutive {

    public int maxElement(int arr[],int n){
        int maxele = 0;
        int count = 0;
        for(int i = 0 ; i<n;i++){
            if(arr[i] ==1){
                count++;

            }else{
                count = 0 ;
            }
       maxele =  Math.max(count, maxele);
        }
        return  maxele;

    }
        public static void main(String[] args) {
            MaximumConsicutive mc = new MaximumConsicutive();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the arrray : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the Array Elements");
            for (int i = 0; i < n; i++) {
                arr[i]  = sc.nextInt(); 
            }

            System.out.println("The maximum Consiqutive elements : "+mc.maxElement(arr, n));

        }   

}
