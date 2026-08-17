
class RotateaMatrixBy90degree {

    public int[][] brute(int matrix[][]) {

        int n = matrix.length;

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][n - 1 - i] = matrix[i][j];
            }
        }

        return arr;

    }


    private void swap(int matrix[][],int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    private void reverse(int matrix[][],int row){
        int left= 0 ; int right = matrix[row].length -1 ; 


        while(left < right){
            int temp = matrix[row][left];
            matrix[row][left] = matrix[row][right];
            matrix[row][right]  = temp;
            left++;
            right--;
        }


    }

    public void optimal(int matrix[][]){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for(int j = i+1;j<n;j++){
                    swap(matrix, i, j);
            }
        }

        for (int i = 0; i < n; i++) {
            reverse(matrix, i);
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RotateaMatrixBy90degree rmd = new RotateaMatrixBy90degree();

        // int rotated[][] = rmd.brute(mat);
     rmd.optimal(mat);

        for(int n[]:mat){
            for(int value:n){
                System.out.print(value+" ");
            }
            System.out.println();
        }


    }

}
