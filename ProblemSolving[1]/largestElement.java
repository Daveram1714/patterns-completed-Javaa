
import java.util.Arrays;

 class largestElement {


    public void brute(int arr[]){
            Arrays.sort(arr);
            System.out.println("The Largest Element is " + arr[arr.length-1]);
    } 


    public void optimal(int arr[]){
        int largest = arr[0];

        for(int i = 1 ; i<arr.length ;i++){
                if(largest < arr[i]){
                    int temp = arr[i];
                    arr[i] = largest;
                    largest = temp;
                }

        }
        System.err.print("The Largest i s " + largest);

    }


    public static void main(String[]args){
            largestElement le = new largestElement();
            int arr[] ={3,2,1,5,2};
            le.brute(arr);
            le.optimal(arr);


    }



}
