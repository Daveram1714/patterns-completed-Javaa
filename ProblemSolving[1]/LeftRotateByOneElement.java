public class LeftRotateByOneElement {
    
    public void Lrotate(int [] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length -1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,7};
        LeftRotateByOneElement le  = new LeftRotateByOneElement();
        le.Lrotate(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }

}
