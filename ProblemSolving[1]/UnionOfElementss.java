
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
    


        public void Optimal(int arr1[],int arr2[]){
            ArrayList<Integer> unionArray  = new ArrayList<>();
            int j = 0 ;
            int  i = 0 ;
            int n1 = arr1.length ;
            int n2 = arr2.length ; 

            while (i< n1 && j < n2) {
                    if(unionArray.isEmpty() || unionArray.get(unionArray.size() -1) != arr1[i]){
                            unionArray.add(arr1[i]);
                            i++;
                    }
                    else {
                        if(unionArray.isEmpty() || unionArray.get(unionArray.size() -1 )!= arr2[j]){
                        unionArray.add(arr2[j]);
                        j++;
                    }}
            }


            while(i<n1){
                if(unionArray.isEmpty() || unionArray.get(unionArray.size() -1) != arr1[i]){
                    unionArray.add(arr1[i]);
                    i++;
                }
            }

            while (j<n2) { 
                    if(unionArray.isEmpty() || unionArray.get(unionArray.size()-1) != arr2[j]){
                        unionArray.add(arr2[j]);
                    j++;
                    }

            }

            System.out.println("Union : "+unionArray);

        }



    public static void main(String[] args) {
        UnionOfElementss obj = new UnionOfElementss();

        int arr1[] = {1, 2, 3, 4, 5,7,9};
        int arr2[] = {2, 3, 4, 4, 5, 6,8};

        // obj.Brute(arr1, arr2);
        obj.Brute(arr1, arr2);
    }
}
