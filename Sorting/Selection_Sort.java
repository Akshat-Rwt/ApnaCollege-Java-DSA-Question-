package Sorting;
public class Selection_Sort {
    
    public static void SelectionSort(int arr[]){
        for(int i = 0 ; i < arr.length -1 ;i++){
            int MinPos = i ;
            for(int j = i +1 ; j < arr.length ; j ++){
                if(arr[MinPos] > arr [j]){
                    MinPos = j ;


                }

            }
            // swap
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp ;
            

        }
        
    }
        public static void printArr(int arr[]){
            for(int  i =0 ; i < arr.length ; i++){
                System.out.print(arr[i] + " ");

            }
            System.out.println();

        
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        SelectionSort(arr);
        printArr(arr);
    }
    

    
}
