public class Sum_of_Array_Element {
    public static int sum(int arr[] ,int n){
        if(n<=0){
            return 0; 
        }
        return arr[n-1]+sum(arr,n-1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        System.out.println(sum(arr,n));
    }
    
}
