
import java.util.ArrayList;

public class MoveAllZeroTOend {

    public void bruteForec(int arr[]) {
        //Setp 1 : Store All the Non zero number in the temp Array
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] != 0 ){
                    temp.add(arr[i]);
                }
        }

        //Step 2 Assign the Values to the Original Array 
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        //step 3 add the Zero for the rest of the values

            for (int i =  temp.size(); i < arr.length; i++) {
                arr[i] = 0;
            }



    }



    public void Optimal(int []arr){
        int j = -1;
       
        for(int i=0;i<arr.length ; i++){
            if(arr[i] ==0){
                j = i;
                break;
            }
        }


        if(j == -1) return ;
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }


    public static void main(String[] args) {
        
            MoveAllZeroTOend me = new MoveAllZeroTOend();
            int arr[] = {1,0,2,3,2,0,0,4,5,1};
            // me.bruteForec(arr);
            me.Optimal(arr);
            System.out.println("The Valies is  : ");
            for(int num:arr){
                System.out.print( + num );
            }

    }

}
