
import java.util.Arrays;
import java.util.Scanner;

public class Hashing {
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ;i<n;i++){
                arr[i] = sc.nextInt();
        }



        int hash[] = new int[13];

        for (int i = 0; i < n; i++) {
                hash[arr[i]] += 1; 
        }


        System.out.println(Arrays.toString(hash));

        int q;
        System.out.println("Enter the Q");
        q = sc.nextInt();

        while(q-- >0){
            int number = sc.nextInt();
            System.out.println("Hash Number" + hash[number]);
        }

        
        
    }
    
    // return 0 ;  



}
