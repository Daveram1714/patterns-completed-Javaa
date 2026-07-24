
import java.util.Scanner;

public class LeftRotateElementByKElements {

    public void Brute(int d, int n, int arr[]) {
        d = d % n;
        int[] temp = new int[d];

        // Store first d elements
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy temp elements to the end
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the N value");
        int n = sc.nextInt();
        System.err.println("Enter the d value");
        int d = sc.nextInt();
        System.err.println("Entee thr Array of Values");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        LeftRotateElementByKElements lre = new LeftRotateElementByKElements();
        lre.Brute(d, n, arr);
        System.err.println("Left ROteted array : ");
        for(int num:arr){
            System.out.print( num);
        }
    }
}
