
class SortanArrayof {

    public void better(int arr[]) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }

        for (int i = count0; i < count0+count1; i++) {
                arr[i] = 1;
        }
        for (int i =count0+ count1; i <arr.length; i++) {
            arr[i] = 2;
        }


    }


   public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }


    public void Optimal(int arr[]){
        int low = 0 , mid = 0 , high = arr.length -1;
    
        while(mid<= high){
            if(arr[mid] ==0){
                swap(arr,low, mid);
                low++;
                mid++;
            }

            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }


        }
    
    }

    public static void main(String[] args) {
        int arr [] = {0,1,1,0,1,2,1,2,0,0,0};
        SortanArrayof sf = new SortanArrayof();
        // sf.better(arr);

            sf.Optimal(arr);
        for(int num :arr){
            System.out.print(num + ",");
        }
    }

}
