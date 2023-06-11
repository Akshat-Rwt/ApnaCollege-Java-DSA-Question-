package Recursion;

import java.text.BreakIterator;

public class SearchElement {

    public static void searchElementLoop(int arr[] , int num){
        for(int i = arr.length-1; i >= 0 ;i--){
            if(arr[i] == num){
                System.out.println(i);
                break;
            }
        }
    }
   
    public static int  searchElementRec(int arr[] ,int num , int index ){
        if(index == 0){
            return -1 ;
        } 
        if(arr[index] == num){
            return index;       
        }
        return searchElementRec(arr, num , index-1);

    }
    public static void main(String[] args) {
        int arr[] = {20 ,90 ,1 , 90 ,80};
        int num  = 90;
        int index  = arr.length-1 ;
        searchElementLoop(arr, num);
        System.out.println(searchElementRec(arr, num , index)); 
    }

    
}
