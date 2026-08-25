import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MajorityElement2 {

    public List<Integer> brute(int arr[]) {

        List<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (result.size() == 0 || result.get(0) != arr[i] && (result.size() < 2 || result.get(1) != arr[i])) {
                int count = 0;

                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > n / 3) {
                    result.add(arr[i]);
                }
            }
            if (result.size() > 2)
                break;
        }
        return result;
    }

    public List<Integer> better(int arr[]) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int mini = n / 3 + 1;
        for (int i = 0; i < n; i++) {
            mpp.put(arr[i] , mpp.getOrDefault(arr[i],0 )+1 );

            if(mpp.get(arr[i]) == mini ){
                result.add(arr[i]);
            }
            if(result.size()==  2) break;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 33, 33, 11, 33, 11 };

        MajorityElement2 sol = new MajorityElement2();
        // List<Integer> ans = sol.brute(arr);
        List<Integer> ans = sol.better(arr);

        System.out.print("The majority elements are: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
