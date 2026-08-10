
import java.util.ArrayList;

public class RearrangeElementBySign {

    public void brute(int arr[]) {

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negaative = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negaative.add(arr[i]);
            } else {
                positive.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length / 2; i++) {
            arr[2 * i] = positive.get(i);
            arr[2 * i + 1] = negaative.get(i);
        }

    }

public int[] optimal(int arr[]){
    int positive = 0,negaative =1;
    int ans[] = new int[arr.length];
    for(int i  = 0;i<arr.length ; i++){
        if(arr[i] > 0 ){
            ans[positive] = arr[i];
            positive +=2;
        }
        else{
            ans[negaative] = arr[i];
            negaative+=2;
        }
    }
    return ans;
}




    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5};
        RearrangeElementBySign re = new RearrangeElementBySign();
        // re.brute(arr);
        int[] result = re.optimal(arr); 
        for(int num :result){
            System.out.print(num+" ");
        }

    }

}
