import java.util.*;

class ThreeSum {


    public List<List<Integer>> brute(int arr[]){

        Set<List<Integer>> st = new HashSet<>();
        int n = arr.length;

        for(int i =0;i<n;i++){
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }


        return  new ArrayList<>(st);
    }
    
    public static void main(String[] args) {
        ThreeSum  ts = new ThreeSum();
            int arr[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = ts.brute(arr);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }        
    }
}
