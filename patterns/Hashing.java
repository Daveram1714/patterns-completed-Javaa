
import java.util.Scanner;



public class Hashing {
    
    // public static void main(String[] args) {
    //     int n;
    //     System.out.println("Enter the size of the array");
    //     Scanner sc = new Scanner(System.in);
    //     n = sc.nextInt();
    //     int []arr = new int[n];
    //     for(int i = 0 ;i<n;i++){
    //             arr[i] = sc.nextInt();
    //     }



    //     int hash[] = new int[13];

    //     for (int i = 0; i < n; i++) {
    //             hash[arr[i]] += 1; 
    //     }


    //     System.out.println(Arrays.toString(hash));

    //     int q;
    //     System.out.println("Enter the Q");
    //     q = sc.nextInt();

    //     while(q-- >0){
    //         int number = sc.nextInt();
    //         System.out.println("Hash Number" + hash[number]);
    //     }

        
        
    // }
    

    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s");
        s = sc.nextLine();

//         preComputation of the hash array
        
        int hash[] = new int[256];
        for(int i = 0 ;i<s.length();i++){
            hash[s.charAt(i)] +=1;
        }
        int q;
        System.out.println("Enter q");
        q = sc.nextInt();
        while (q-- > 0) { 
            char c;
            System.out.println("Enter the character");
            c = sc.next().charAt(0);
            //Fetching the frequency of the character from the hash array
            System.out.println("Frequency of " + c + " is " + hash[c]);

        }
    }


}
