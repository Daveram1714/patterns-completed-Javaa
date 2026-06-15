
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BasicMaths {

    public void ReverseNumber(int N) {
        int lastDigit = 0;
        while (N > 0) {
            lastDigit = N % 10;
            System.out.println("Last Digit :" + lastDigit);
            N = N / 10;
        }

    }

    public void CountDigits(int N) {
        int digitCount = 0;
        while (N > 0) {
            int countR = N % 10;
            N = N / 10;
            digitCount++;

        }
        System.out.println("digit count :" + digitCount);

        return;
    }

    public void CountDigitLog(int N) {
        int count = (int) Math.log10(N) + 1;
        System.out.print(count);
    }

    public int ReverseNumm(int N) {
        int reverse = 0;
        while (N > 0) {
            int lastDigit = N % 10;
            N = N / 10;
            reverse = (reverse * 10) + lastDigit;
        }
        return reverse;
    }

    public boolean Palindropm(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int last = n % 10;
            n = n / 10;
            reverse = (reverse * 10) + last;
        }

        return reverse == original;
    }

    public boolean Amstrong(int N) {
        int sum = 0;
        int originala = N;
        while (N > 0) {
            int last = N % 10;
            N = N / 10;
            sum = sum + (last * last * last);
        }
        return sum == originala;
    }

    public void AllDivisors(int N) {
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                // System.out.print(i+" ");
                if (i == N) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");

                }
            }
        }
    }

    public void AllDivisorsOptimized(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {

                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }

            }

        }
        Collections.sort(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public void PrimeNumber(int n) {
        int count = 0;
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }

            }

        }
        if (count == 2) {
            System.out.print("it is a primt");
        } else {
            System.out.print("It is not a prime");
        }
    }

    public void GCD(int n1, int n2) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                gcd = i;
            }
        }
        System.out.print(gcd);
    }

    public void GCDOptimizes(int n1, int n2) {
        int gcd = 0;
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("The GCD is " + i);
                break;
            }
        }
    }

    public void GCDEcludiean(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = (n1 % n2);
            } else {
                n2 = n2 % n1;
            }
        }
        if (n1 == 0) {
            System.out.println(n2);
        } else {
            System.out.println(n1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digits :");
        int N = sc.nextInt();
        System.out.print("Enter the 2nd Digit");
        int N2 = sc.nextInt();
        BasicMaths digit = new BasicMaths();

        // rev.ReverseNumber(N);
        // digit.CountDigits(N);
        // digit.CountDigitLog(N);
        //    int resullt =   digit.ReverseNumm(N);
        //    boolean resullt =   digit.Palindropm(N);
        // boolean result  = digit.Amstrong(N);
        //  digit.AllDivisors(N);
        // digit.AllDivisorsOptimized(N);
        // digit.PrimeNumber(N);
        // digit.GCD(N, N2);
        // digit.GCDOptimizes(N, N2);
        digit.GCDEcludiean(N, N2);
        // System.out.print("The Resu;t is : " + result);
    }
}
