//Check whether n is present in an array of size m or not.Input -n,m (Input number, size of array)-Take input n elements for the arrayOutput -> true/false

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
    
    public static int getMin(int arr[], int n){
        
           int min = arr[0];
           
          for(int i=1; i<n;i++){
               min = Math.min(arr[i], min);
             }
             
             return min;
        }
        
        
         public static int getMax(int arr[], int n){
        
           int max = arr[0];
           
          for(int i=1; i<n;i++){
               max = Math.max(arr[i], max);
             }
             
             return max;
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
        
        int mini = getMin(arr,n);
        int maxi = getMax(arr,n);
        
        System.out.println("Min : " + mini);
        System.out.println("Min : " + maxi);
        
        
	}
}


---------------------------------------------------------------------------------------------------------------------------------------------



//Check whether n is present in an array of size m or not.Input -n,m (Input number, size of array)-Take input n elements for the arrayOutput -> true/false

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
    
    public static int getMin(int arr[], int i, int n){
        
        return (n==1) ? arr[i] : Math.min(arr[i],  getMin(arr,i+1,n-1));
        
        }
        
        
         public static int getMax(int arr[], int i,int n){
             
              return (n==1) ? arr[i] : Math.max(arr[i],  getMax(arr,i+1,n-1));
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
        
        int mini = getMin(arr,0,n);
        int maxi = getMax(arr,0,n);
        
        System.out.println("Min : " + mini);
        System.out.println("Min : " + maxi);
        
        
	}
}
