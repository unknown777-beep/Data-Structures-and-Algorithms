public class rotatearray {
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=2;
        rotateArr(arr,d);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
