
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PascalsTriangle {
    // Problem 1:
    // Find the element at given coordinates

    public int NCR(int r, int c) {

        int result = 1;

        int n = r - 1;
        int k = c - 1;

        for (int i = 0; i < k; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }

        return result;
    }

    public List<Long> getNthRow(int n) {
        List<Long> row = new ArrayList<>();

        long val = 1;

        row.add(val);

        for (int i = 1; i < n; i++) {
            val = val * (n - i) / i;
            row.add(val);

        }

        return row;
    }



      public List<List<Integer>> generate(int numRows) {
        // Result list to hold all rows
        List<List<Integer>> triangle = new ArrayList<>();

        // Loop for each row
        for (int i = 0; i < numRows; i++) {
            // Create a row with size (i+1)
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));

            // Fill elements from index 1 to i-1 (middle values)
            for (int j = 1; j < i; j++) {
                // Each element = sum of two elements above it
                row.set(j, triangle.get(i - 1).get(j - 1) +
                           triangle.get(i - 1).get(j));
            }

            // Add current row to the triangle
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalsTriangle sol = new PascalsTriangle();
        // int r = 5;
        // int c = 3;
        // System.out.println(sol.NCR(r, c));
                int N = 5; // Example: 5th row

    //       List<Long> result = sol.getNthRow(N);

    //     // Print the row
    //     for (long num : result) {
    //         System.out.print(num + " ");
    //     }
    // }

    List<List<Integer>> result = sol.generate(N);
        for (List<Integer> row : result) {
            for (Integer val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}