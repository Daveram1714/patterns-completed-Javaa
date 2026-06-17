
import java.util.Scanner;

public class Recurssion {
    public void Recurssion1(int n){
        if(n == 0) return;
        else{
            System.out.println("Daveram");
         
        }
        Recurssion1(n-1);
    }
    

    public void Resurssion2(int n){
        if(n ==0) return;
        else{
            System.out.print(n);
            Resurssion2(n-1);
        }
    }

    public void Resurssion3(int i,int n){
        if(i < 1 ) return; 
   
            Resurssion3(i-1,n);
            System.out.print(i);
    
    }

//     public void Resurssion3(int i, int n) {
// // Base case: stop when i is less than 1
// if (i < 1) return;

// // Recursive call first
// Resurssion3(i - 1, n);

// // Print after the call (backtracking)
// System.out.print(i + " ");
// }
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of time to Print : ");
        int N = sc.nextInt();
        Recurssion rs = new Recurssion();
        // rs.Recurssion1(N);
        // rs.Resurssion2(N);
        rs.Resurssion3(N,N);
    }
}
