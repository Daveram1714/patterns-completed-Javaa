import java.util.HashSet;

class RemoveDuplicates {

    public int bruteforce(int[] arr) {

        HashSet<Integer> seen = new HashSet<>();
        int index = 0;

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                arr[index] = num;
                index++;
            }
        }

        return index;
    }


  
    public int optimal(int[] arr){
        int i = 0 ;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return  i+1;
        
    }
     

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        // RemoveDuplicates sol = new RemoveDuplicates();
        RemoveDuplicates sol = new RemoveDuplicates();

        // int k = sol.bruteforce(nums);
        int k = sol.optimal(nums);

        System.out.println("k = " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}