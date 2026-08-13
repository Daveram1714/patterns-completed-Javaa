
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LongestConsiqutive {

    private boolean linearSearch(int arr[], int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }

    public int brute(int arr[]) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int target = arr[i];

            while (linearSearch(arr, target + 1) == true) {
                target++;
                count++;
            }
            longest = Math.max(longest, count);
        }

        return longest;
    }

    public int better(int arr[]) {
        int longest = 0;
        int count = 0;
        int lastSmallest = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - 1 == lastSmallest) {
                count++;
                lastSmallest = arr[i];
            } else if (arr[i] != lastSmallest) {
                count = 1;
                lastSmallest = arr[i];
            }
            longest = Math.max(longest, count);
        }

        return longest;
    }

    public int optimal(int nums[]) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int longest = 0;
        int target = 0 ;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for (int it : set) {
                    int count = 1 ;

                if(!set.contains(it-1)){

                    count ++;
                    target = it;

                    while (set.contains(target+1)) { 
                        count++;
                        target =  target+1;
                    }


                }
                longest = Math.max(longest, count);
        }
        return  longest;

    }

    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        LongestConsiqutive lc = new LongestConsiqutive();
        // System.out.println(lc.brute(arr));
        System.out.println(lc.better(arr));
    }
}
