package Rec;

public class LastOccurence {
   public  static int  searchNum(int arr[] , int key , int i){
        if(i == 0){
            return -1 ;
        }
        if(arr[i] == key){
           return i;  
        }

        return searchNum(arr, key, i-1);
    }
      
    public static void main(String[] args) {
        int arr[] = {5,5,5,5};
        int i = arr.length-1;
        System.out.println(searchNum(arr , 5, i)); 
    }
    
}