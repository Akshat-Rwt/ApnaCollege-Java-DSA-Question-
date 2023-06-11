package Recursion;

import java.util.*;
public class Pattern6 {
	
static void print_space(int space)
{
	
	if (space == 0)
		return;
	System.out.print(" ");

	
	print_space(space - 1);
}


static void print_asterisk(int asterisk)
{
	
	if (asterisk == 0)
		return;
	System.out.print("* ");

	
	print_asterisk(asterisk - 1);
}


static void pattern(int n, int num){

	if (n == 0)
		return;
	print_space(n - 1);
	print_asterisk(num - n + 1);
	System.out.println("");


	pattern(n - 1, num);
}


public static void main(String[] args)
{
	int n = 5;
	pattern(n, n);
}
}




