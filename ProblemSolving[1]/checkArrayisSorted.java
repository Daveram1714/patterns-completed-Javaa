public class checkArrayisSorted {

    public boolean  checkSorted(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i-1]){
                
            }
            else{
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,2,3,4,6,7};
        checkArrayisSorted cs = new checkArrayisSorted();
        System.out.print(cs.checkSorted(arr));
    }
}
