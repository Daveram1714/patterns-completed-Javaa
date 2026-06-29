
import java.util.Scanner;

class Patttern1 {

    public void pattern1(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.err.println();
        }

    }

    public void pattern2(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // public void pattern3(int num) {
    //     for (int i = 1; i <=num; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
    public void pattern4(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public void pattern5(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void pattern6(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();

        }
    }

    public void pattern7(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");

            }
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");

            }

            System.err.println();

        }

    }

    public void pattern8(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * num - 2 * i - 1); j++) {
                System.out.print("*");

            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }

            System.err.println();

        }

    }

    public void pattern10(int n) {
        for (int i = 1; i < 2 * n - 1; i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 0; j <= star; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

    public void pattern11(int n) {
        int start;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }

    public void pattern12(int n) {
        int spaces = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;

        }
    }

    public void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i; j++) {

                System.out.print(num + " ");
                num  = num +  1;
            }
            System.out.println();
        }
    }


    public void pattern21(int n){


        for(int i = 0 ;i<2*(n-1);i++){
            
            for (int j = 0; j < 2*n-1; j++) {
                int top =i ;
            int left = j;
            int right = 2*n-2-j;
            int bottom = 2*n-2-i;
            System.out.print(n-Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the numbe of times");
        int num = sc.nextInt();
        Patttern1 obj = new Patttern1();
        obj.pattern21(num);
        sc.close();
    }
}
