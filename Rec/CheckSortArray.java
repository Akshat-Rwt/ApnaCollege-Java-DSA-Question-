package Rec;

public class CheckSortArray {

    static boolean ischeckArr(int arr[] , int index){
       
        if(index  == arr.length -1){
            return true ;
        }
        if(arr[index] > arr[index+1]){
            return false ;
        }
        return(ischeckArr(arr, index+1));               
    }

    static boolean Arrloop(int arr[] , int index){
        boolean  t = true;
        for(int i = 0 ; i < arr.length-1 ; i ++){
            if(arr[i] > arr[i+1]){
                t= false;
            }
        }
        if(t == false){
            return false;
        }
        else{
            return true ;

        }

    }
    public static void main(String[] args) {
        
        int arr[] = { 1,3 ,2,4 ,5,6};
        int index =0 ;
        System.out.println(ischeckArr(arr , index));
        System.out.println(Arrloop(arr, index));
        
        
    }
    
}
