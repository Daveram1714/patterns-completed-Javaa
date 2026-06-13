
    import java.util.Scanner;

    public class BasicMaths {
        public void ReverseNumber(int N){
            int lastDigit = 0 ;
            while(N>0){
                lastDigit = N%10;
                System.out.println("Last Digit :"+lastDigit);
                N = N/10;
            }


        }

        public void CountDigits(int N){
            int digitCount = 0;
            while (N>0) {
                int countR = N%10;
                N = N/10;
                digitCount++;

            }
            System.out.println("digit count :" +digitCount);

                return ;  
        }


        public void CountDigitLog(int N){
            int count  =(int)Math.log10(N) + 1 ;
            System.out.print(count);
        }


        public int ReverseNumm(int N){
            int reverse = 0;
            while(N >0){
                int lastDigit  = N%10;
                N =N/10;
                reverse = (reverse * 10)+lastDigit;
            }
            return  reverse;
        }



        public boolean Palindropm(int n){
            int original = n;
            int reverse = 0;
            while( n > 0){
                int last = n %10;
                n = n/10;
                reverse = (reverse *10) + last;
            }
            
            return  reverse == original;
        }
        

        public boolean  Amstrong(int N){
            int sum = 0;
            int originala = N;
            while(N>0){
                int last  = N%10;
                N = N/10;
                sum = sum+ (last * last*last);
            }
            return sum == originala;
        }

        public void AllDivisors(int N){
            for(int i =1 ;i<=N;i++){
                if(N%i == 0 ){
                    // System.out.print(i+" ");
                    if(i == N){
                        System.out.print(i);
                    }else{
                        System.out.print(i+",");
                        
                    }
                }
            }
        }

        public static  void main(String[]args){
            Scanner sc  = new Scanner(System.in);
            System.out.print("Enter the Digits :");
            int N  = sc.nextInt();
            BasicMaths digit = new BasicMaths();
            
            // rev.ReverseNumber(N);
            // digit.CountDigits(N);
            // digit.CountDigitLog(N);
        //    int resullt =   digit.ReverseNumm(N);
        //    boolean resullt =   digit.Palindropm(N);
           
        // boolean result  = digit.Amstrong(N);
             digit.AllDivisors(N);
        // System.out.print("The Resu;t is : " + result);
        }
    }
