package Recursion;

public class SortArray{
    static boolean isSorted(int arr[] , int index){
        //Termination Case 
        if(arr.length -1 == index){
            return true ;
        }
        if(arr[index] > arr[index+1]){
            return false ;
        }
        //Samll Problem
        return isSorted(arr , index+1);
    }
   public static void main(String[] args) {
    int arr[] = {4,3,6,2,5,1};
    boolean result  = (isSorted(arr , 0));
    System.out.println(result);
   } 
}