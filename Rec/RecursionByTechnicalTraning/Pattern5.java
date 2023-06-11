package Recursion;

public class Pattern5 {
    

    static int print_row(int count, int currentrow)
{

    if (currentrow== 0)
        return count;

    System.out.print((char)(count + 64) + "  ");
 
    
    print_row(count + 1, currentrow - 1);
    return currentrow + count ;
}
 

static void pattern(int row,int count, int currentrow)
{
    
    if (row == 0)
        return;

    count = print_row(count, currentrow);
    System.out.println();
 
    
    pattern(row- 1, count, currentrow + 1);
}
 

public static void main (String[] args)
{
    int row = 5;
    int currentrow =1 ;
    int count  =1;
    pattern(row , count , 1);
}
    
}




