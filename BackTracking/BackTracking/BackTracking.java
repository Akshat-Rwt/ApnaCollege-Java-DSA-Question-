package BackTracking ;
public class BackTracking {
    public static void changeArray(int arr[] , int i , int vol){

        //Base Case 
        if(i == arr.length){
            printArr(arr) ;
            return ;
        }

        //recursion 
        arr[i] = vol ;
        changeArray(arr, i+1, vol+1);
        arr[i] = arr[i] -2 ;

    }

    public static void printArr( int arr[]){
        for(int i = 0 ; i <arr.length; i++){
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2, 3 , 4,5 };
        changeArray(arr, 0, 1);
        printArr(arr); 
    }
    
}
