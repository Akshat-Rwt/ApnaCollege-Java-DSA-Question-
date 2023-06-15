package DivideAndConquer;

public class MergeSort {
    public static void printArr(int arr[]){
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[] , int si , int ei  ){
        //Base Case -->
        if(si>=ei){
            return ;
        }

        //kaam -->
        int mid = si+(ei-si)/2 ; //(si+ei)/2
        mergeSort(arr, si, mid); // left side
        mergeSort(arr, mid+1, ei); //Right side
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[] , int si , int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si ; // iteration fo left part
        int j = mid + 1 ; // iteration for right  part
        int k = 0; // iteration for temp arr

        while (i <= mid && j <= ei){

            if(arr[i] < arr[j]){
                temp[k] = arr[i];
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++ ;
        }

        //left part -->
        while(i<= mid){
            temp[k++] = arr[i++];
        }

        //right part -->
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original arr --> 
        for(k = 0 , i = si ; k < temp.length ; k++ , i++){
            arr[i] = temp[k] ;
        }

    } 
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,2};
        mergeSort(arr , 0 , arr.length-1);
        printArr(arr);
    }
    
}
