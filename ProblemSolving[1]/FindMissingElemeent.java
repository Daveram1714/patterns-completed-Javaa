
public class FindMissingElemeent {

    public int Brute(int arr[], int n) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {

                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }

        }
        return -1;
    }

    public int better(int n, int arr[]) {
        int hash[] = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]] = 1;
        }
        for (int i = 1; i <= n; i++) {

            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public int optimal1(int arr[],int n){
        int total = n*(n+1)/2;
        int sum = 0;
            for(int i =0;i<n-1;i++){
                sum += arr[i];
            }
            System.out.println("Sum : "+sum);
            System.out.println("total : "+total);
            return  total-sum;

        }

    public static void main(String[] args) {
        FindMissingElemeent fe = new FindMissingElemeent();
        int arr[] = {1, 2, 4, 5};
        int n = 5;
        //   System.out.println("The Missing Number : " + fe.Brute(arr, n));
        // System.out.println("The Missing Number : " + fe.better(n, arr));
        System.out.println("The Missing Number : " + fe.optimal1(arr, n));
    }
}
