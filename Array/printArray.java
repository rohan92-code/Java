// 1)Create an Array of size 10 of integers. Take input from the user for these 10 elements and print the entire array after that.

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
       // int n;
        //Scanner s  = new Scanner(System.in);
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter the number of element");
        int n = in.nextInt(); 
       // n = s.nextInt();10
        
        System.out.println("please enter the " + n + " elements");
         
         int [] arr = new int[n];
        
        for(int i=0; i<n;i++){
            arr[i] = in.nextInt();
        }
        
        for(int i=0; i<n;i++){
            
            System.out.print(arr[i] + " ");
        }
        
	}
}

