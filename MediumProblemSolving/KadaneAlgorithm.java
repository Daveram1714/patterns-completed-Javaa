
class MaximumSubArray {

    public int brute(int arr[]) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maximum = Math.max(maximum, sum);
            }
        }
        return maximum;

    }

    public long kandels(int arr[]) {
        long sum = 0, max = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max) {
                max = sum;

            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return max;
    }

    public void followup(int arr[]) {
        int start = 0;
        int start_index = -1;
        int  end_index = -1;
        int sum = 0  ;
        long  max = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (sum == 0) {
                start = i;
            }
            sum += arr[i];

            if (sum > max) {
                max = sum;
                start_index = start;
                end_index = i;
            }

            if (sum < 0) {
                sum = 0;
            }

        }

        System.out.println("The Maxmimum Sum is : " + max);
        System.out.print("The Sub arrray for maximum sum is : [");
        for (int i = start_index; i <= end_index; i++) {
            System.out.print(arr[i]);

        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        MaximumSubArray ma = new MaximumSubArray();
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // System.out.println("Maxium Sub array : " + ma.brute(arr));
        // System.out.println("Maxium Sub array : " + ma.kandels(arr));
        ma.followup(arr);
    }

}
