
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


    public void Recurssion4(int i,int n){
        if(i>n) return;
        Recurssion4(i+1, n);
        System.out.print(i);
    }

    public void Recurssion4Forward(int n){
        if( n ==0) return;;
        System.out.println(n);
        Recurssion4Forward(n-1);
    }

 
    public void SumofTwoParameters(int n,int sum){
         if(n < 1) {
            System.out.println(sum);
            return;
        }
        SumofTwoParameters(n-1, sum+n);
    }


    public int SumOfTwoFunctional(int n){
        if(n == 0 ){
            return 0 ;
        }
        return  n + SumOfTwoFunctional(n-1);

    }
   
    public int FactoralOfNumber(int n){
        if(n <1 ) return  1;
        return  n * FactoralOfNumber(n-1);
    }
   

    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of time to Print : ");
        int N = sc.nextInt();
        Recurssion rs = new Recurssion();
        // rs.Recurssion1(N);
        // rs.Resurssion2(N);
        // rs.Resurssion3(N,N);
        // rs.Recurssion4(0,N);
        // rs.Recurssion4Forward(N);
        // rs.SumofTwoParameters(N,0);
        // int result = rs.SumOfTwoFunctional(N);
        int result = rs.FactoralOfNumber(N);
        System.out.println("Result " + result);
    }
}
