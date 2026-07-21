import java.util.Arrays;

class secondLargestElement{
    

    public void brute(int arr[]){

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];
        
        for(int i = arr.length-2 ;i>=0 ;i--){
            if(largest != arr[i]){
                int temp = arr[i];
                arr[i] = largest;
                largest = temp;
                break;
            }
        }
        System.out.println("The Second Largest is " + largest);
    }

    public void better(int arr[]){
        int largest , sLargest;
        largest = arr[0];
        for(int  i = 1;i<arr.length ; i++){
            if(largest <arr[i]){
                largest =arr[i];
            }
        }
        sLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > sLargest  && largest != arr[i]){
                sLargest = arr[i];
            }
        }

        System.out.println("The Second Largest is " + sLargest);

    }

    public void optimal(int arr[]){
        int largest = Integer.MIN_VALUE, slargest = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else {
                if(arr[i] < largest && arr[i] > slargest){
                    slargest = arr[i];
                }
            }
        }
        System.out.println("Second Largest : "+ slargest);
    }


    public  void optimalSecondsmall(int[] arr) {
        int small = Integer.MAX_VALUE , second_small = Integer.MAX_VALUE;
    
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < small ){
                second_small = small;
                small = arr[i];
            }
            else {
                if( arr[i] < second_small && arr[i] != small){
                    second_small = arr[i];
                }
            }
        }

        System.err.println("Second small" + second_small);

}
    
    public static void main(String[] args) {

        secondLargestElement se = new secondLargestElement();
        int arr[] = {6,1,2,4,7,7,5};
        // se.brute(arr);
        se.optimal(arr);
        se.optimalSecondsmall(arr);
    }
}