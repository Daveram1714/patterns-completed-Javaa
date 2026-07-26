
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionOfElementss {
    
        public void Brute(int arr1[],int arr2[]){
            ArrayList<Integer> union = new ArrayList<>();
            Set<Integer> in = new HashSet<>();
            for (int i =0 ;i<arr1.length;i++){
                in.add(arr1[i]);
            }

            for(int i = 0 ;i<arr2.length ;i++){
                in.add(arr2[i]);
            }
            
            for(int it:in){
                    union.add(it);
            }

            System.out.println("Union : "+union);
        }
    


    public static void main(String[] args) {
        UnionOfElementss obj = new UnionOfElementss();

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 4, 5, 6};

        obj.Brute(arr1, arr2);
    }
}
