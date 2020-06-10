

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
    
    public static int[] sort(int arr[], int n){
          
    
         for(int i=0 ; i<n-1; i++){
               int imin = i;
             for (int j= i + i ; j < n ; j++ ){
                 
                 if(arr[imin] > arr[j]){
                     imin = j;   
                 }
             }
            
            int temp = arr[i];
            arr[i] = arr[imin];
            arr[imin]  = temp;
         }
         
         return arr;
        
        }
        
        
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter the number of element");
        int n = in.nextInt(); 
      
        System.out.println("please enter the " + n + " elements");
         
         int [] arr = new int[n];
        
        for(int i=0; i<n;i++){
            arr[i] = in.nextInt();
        }
        
        int [] res = sort(arr,n);
       

        System.out.println("Sorted array : " + Arrays.toString(res));
        
        
        
	}
}
