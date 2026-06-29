import java.util.Scanner;

public class Recurssion4 {
    
    public void reverseArray(int i,int[] arr, int n){
            if(i >= n/2) return;
                int temp = arr[i];
                arr[i] = arr[n-i-1];
                arr[n-i-1] = temp;
            reverseArray(i+1, arr, n);
     } 

     public boolean  checkPalindrom(int i ,String str){
        
        if( i >= str.length()/2 ){
            return  true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return  false;
        }
        return  checkPalindrom(i+1, str);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Size  of Array");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the "+n+" elements : ");
        
        // for(int i = 0 ;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }

        Recurssion4 rc = new Recurssion4();
    //      rc.reverseArray(0, arr, n);


    //         System.out.println("The Reversed Array");

    //         for(int num:arr){
    //             System.out.print(num + " ");
    //         }


    System.out.println(rc.checkPalindrom(0, "madaam"));

    }


}
