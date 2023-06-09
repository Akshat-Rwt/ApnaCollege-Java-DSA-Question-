package Rec;

public class PrintAsc {
    public static void PrintAsc(int n ){
        if(n == 1){
            System.out.print(n+ " ");
            return ;
        }
        PrintAsc(n-1);
        System.out.print(n+ " ");
        
    }
    public static void main(String[] args) {
        int  n  =10;
        PrintAsc(n);
    }
    
}