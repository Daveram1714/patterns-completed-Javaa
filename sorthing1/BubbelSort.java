import java.util.Scanner;

class BubbelSort{

    void bubbelsort(int n, int [] arr){

        for(int i = n-1; i >= 0 ; i--) {
        
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }   
        
        }

        
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Entet the size :");

        int n  = sc.nextInt();
        int []arr =new int[n];

        System.out.println("Enter the Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BubbelSort b = new BubbelSort();

        b.bubbelsort(n,arr);

        System.out.println("The Sorted Array");

        for (int i = 0; i < n; i++) {
                System.out.print(arr[i] +" ");
        }

    }
}