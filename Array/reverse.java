//reverse a array
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
    
    public static int[] reverse(int arr[],int n){
          
         int[] array = new int[n];
         
         int j =0;
         
         for(int i=n-1 ; i>=0; i--){
            array[j] = arr[i];
            
            j++;
         }
         
         return array;
        
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
        
        int [] rev= reverse(arr,n);
       

        System.out.println("Reverse array : " + Arrays.toString(rev));
        
        
        
	}
}


--------------------------------------------------------------------------------------------------------------------------------------------



//Check whether n is present in an array of size m or not.Input -n,m (Input number, size of array)-Take input n elements for the arrayOutput -> true/false

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
    
    public static int[] reverse(int arr[],int n){
          
         int[] array = new int[n];
         
         int j= n-1 ;
         
         for(int i=0 ; i<n; i++){
            array[j] = arr[i];
            
            j--;
         }
         
         return array;
        
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
        
        int [] rev= reverse(arr,n);
       

        System.out.println("Reverse array : " + Arrays.toString(rev));
        
        
        
	}
}
