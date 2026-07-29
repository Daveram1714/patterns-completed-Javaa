
class NumberAppearsOnce {

    public int brute(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public int Better(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = Math.max(arr[i], max);
            }

        }
        int hash[] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(hash[arr[i]] ==1){
                return  arr[i];
            }
        }
        return  -1;
    }


    public int optimal(int arr[]){
       int xorr = 0;

        // XOR all elements — duplicates cancel each other out
        for (int num : arr) {
            xorr ^= num;
        }

        return xorr;
    }


    public static void main(String[] args) {
        NumberAppearsOnce no = new NumberAppearsOnce();
        int arr[] = {2, 2, 9, 4,4, 5,5, 6,6};
        // System.out.println("The Number Appears once : " + no.brute(arr));
        // System.out.println("The Number Appears once : " + no.Better(arr));
        System.out.println("The Number Appears once : " + no.optimal(arr));
    }
}
