import java.util.HashMap;
import java.util.Scanner;

 class NumberHashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // HashMap for frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Pre-computation
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nHashMap:");
        System.out.println(map);

        System.out.print("\nEnter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {

            System.out.print("Enter number: ");
            int number = sc.nextInt();

            System.out.println(
                "Frequency of " + number + " is " +
                map.getOrDefault(number, 0)
            );
        }

        sc.close();
    }
}