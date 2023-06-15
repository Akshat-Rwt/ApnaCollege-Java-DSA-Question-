package DivideAndConquer;
public class SearchInRotatedortedArray {

    public static int search(int arr[] , int target , int si , int ei){

        //BASE CASE
        if(si > ei){
            return -1 ;
        } 


        //kaam
        int mid = si + (ei-si)/2 ;
         
        //Case Found 
        if(arr[mid]== target){
            return mid ;
        }

        //Mid on l1
        if(arr[si] <= arr[mid]){
            
            //Case a 
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);

            }
            else{
                //Case b:
                return search(arr, target, mid+1, ei);
            }
        }

        //MId on l2 
        else{
            //Case c 
            if(arr[mid+1] <= target && target <=arr[ei]){
                return search(arr, target, mid+1, ei);
            }

            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6 ; // output --> 4
        System.out.println(search(arr, target, 0, arr.length-1)); 

    }
    
}
