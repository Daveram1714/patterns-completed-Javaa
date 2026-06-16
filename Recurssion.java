
import java.util.Scanner;

public class Recurssion {
    public void Recurssion1(int n){
        if(n == 0) return;
        else{
            System.out.println("Daveram");
         
        }
        Recurssion1(n-1);
    }
    

    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of time to Print : ");
        int N = sc.nextInt();
        Recurssion rs = new Recurssion();
        rs.Recurssion1(N);
    }
}
