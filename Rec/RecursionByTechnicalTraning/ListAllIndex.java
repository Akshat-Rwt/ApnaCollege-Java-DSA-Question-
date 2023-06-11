package Recursion;

public class ListAllIndex {

    static void findIndexloop(int arr[] , int num){
        for(int i = 0 ; i <= arr.length -1 ; i ++){
            if(arr[i] == num){
                System.out.print(i + " ");

            }

        }
        System.out.println();
    }

    static void findIndexRec(int arr[] , int num , int index){
        if(index == (arr.length)){
            return ;
        }

        if(arr[index] == num){
            System.out.print(index + " ");
        }
        findIndexRec(arr, num, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {20,5,6,0,5,9,5};
        int num  = 5;
        int index  = 0;

        findIndexloop(arr , num);
        findIndexRec(arr, num, index);
    }
    
}
