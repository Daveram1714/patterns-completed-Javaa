public class StockByandSell {    
    public static void main(String[] args) {
        // int arr[] = {7,1,5,3,6,4};
        int arr[] = {7,6,4,3,1};
        int mini = arr[0];
        int profit = 0,cost =0;
        for (int i = 1; i < arr.length; i++) {
            mini = Math.min(arr[i], mini);
            cost = arr[i] - mini;
            profit = Math.max(cost, profit);
        }
        System.out.println("The max profit is  : "+profit );
    }

}
