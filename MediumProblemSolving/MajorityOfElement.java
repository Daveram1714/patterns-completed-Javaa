
import java.util.HashMap;

public class MajorityOfElement {

    public int brute(int arr[]) {
        int n = arr.length;
        int target = n / 2;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > target) {
                return arr[i];
            }
        }
        return -1;

    }

    public int better(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();    

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int key:map.keySet()){
                if(map.get(key) > arr.length /2)
                return  key;
        }

        return -1;
    }


    public int optimal(int arr[]){
        int count = 0 , ele =0;

        for(int i = 0 ;i<arr.length ; i++){
            if(count ==0){
                count = 1;
                ele = arr[i];
            }else if(arr[i] == ele){
                count++;
            }else{
                count-- ;
            }
        }

        int count1  = 0;

        for(int i = 0 ;i<arr.length ; i++){
            if(arr[i] ==ele) count1++;
        }
        if(count1 > arr.length/2) return  ele;


        return  -1;
    }

    public static void main(String[] args) {
        MajorityOfElement me = new MajorityOfElement();
        // int arr[] = {2, 2, 3, 3, 1, 2, 2};
        int arr[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        // System.out.print(me.brute(arr));
        // System.out.print(me.better(arr));
        System.out.print(me.optimal(arr));
    }

}
