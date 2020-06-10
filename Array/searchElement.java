//Check whether n is present in an array of size m or not.Input -n,m (Input number, size of array)-Take input n elements for the arrayOutput -> true/false

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static boolean find(int arr[],int m,int n){
        
        boolean res = false;
        
          for(int i=0; i<n;i++){
             if(arr[i] == m){
              res= true;
              break;
             } 
        }
        return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter the number of element");
        int n = in.nextInt(); 
      
        System.out.println("Enter the number to Search");
        
        int m = in.nextInt();
        
        System.out.println("please enter the " + n + " elements");
         
         int [] arr = new int[n];
        
        for(int i=0; i<n;i++){
            arr[i] = in.nextInt();
        }
        
        boolean res = find(arr,m,n);
        
        System.out.println(res);
        
	}
}

