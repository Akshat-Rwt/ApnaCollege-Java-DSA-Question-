package DivideAndConquer.PractiseDivideAndConquer;

public class MergeSortForStringValue {

    public static void printArr(String  arr[]){
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void mergeSort(String[] arr , int si, int  ei){

        //Base Case 
        if(si>ei){
            return  ;
        }

        int mid  = si + (ei-si)/2 ;
        mergeSort(arr, si, mid); //left Side 
        mergeSort(arr, mid, ei); // Right Side
        merge(arr, si, mid, ei);

    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        String temp[] = new String[ei-si+1] ;
        int i = si ; //iteration for left Part
        int j = mid +1; //Iteration for right part
        int k = 0 ; //Iteration for temp part

        while(i <= mid && j <= ei){

            if(arr[i] < arr[j]){
                
            }

        }

    }
 
    public static void main(String[] args) {
        String arr[] = {"sun" , "earth", "mars", "mercury"};
        mergeSort(arr, 0 ,arr.length-1 );
        

    }
    
}
