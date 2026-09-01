import java.util.*;

class ThreeSum {

    public List<List<Integer>> brute(int arr[]) {

        Set<List<Integer>> st = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(st);
    }

    public List<List<Integer>> better(int arr[]) {
        int n = arr.length;
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hasset = new HashSet<>();
            for (int j = i+1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if (hasset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                hasset.add(arr[j]);
            }
        }

        return new ArrayList<>(ans);
    }

    public List<List<Integer>> optimal(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            if(i >0 && arr[i] == arr[i-1]) continue;

            int right= n-1, left = i+1;

            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];

                if(sum == 0){
                    ans.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                    while(left<right && arr[left] == arr[left+1]) left++;
                    while(left < right && arr[right] == arr[right-1]) right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }


        }

        return ans;
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> res = ts.optimal(arr);
        // List<List<Integer>> res = ts.brute(arr);
        // List<List<Integer>> res = ts.better(arr);

        for (List<Integer> triplet : res) {
            for (int num : triplet)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
