class LineanerSearch{
 
    
    public  int fun(int arr[],int num) {
               for(int  i = 0 ;i<arr.length;i++){
            if(arr[i] == num){
                return arr[i];
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int arr[] = {6,7,8,4,1};
        int num = 10;
        LineanerSearch ls = new LineanerSearch();
        System.out.println("The Value : "+ls.fun(arr, num));
    }
}