
import java.util.*;

class LeadersInArray {

    public void brute(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean leader = false;

        for (int i = 0; i < arr.length; i++) {
            leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader == true) {
                ans.add(arr[i]);
            }
        }

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public ArrayList<Integer> optimal(int arr[]) {
        int maxx = Integer.MIN_VALUE;
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxx) {
                ans.add(arr[i]);
            }

            maxx = Math.max(maxx, arr[i]);

        }

        Collections.reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        LeadersInArray la = new LeadersInArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sixe of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    
    
        // la.brute(arr);
        
        ArrayList<Integer> ans =  la.optimal(arr);

        for(int num:ans){
            System.out.print(num+" ");
        }
    
    
    }
}
