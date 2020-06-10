/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
    public static int BinarySearch(int arr[],int low, int high,int x){
       
            if(low>end) return -1;
            
            int mid = start + (end - start)/2;
            
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x) {
                return BinarySearch(arr[],low, mid -1,x);
            }else{
                return BinarySearch(arr[],mid +1,high,x)
            }
            
        }
        
        return -1;
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {1,2,3,5,67,23,11,23,45};
		
		int data = 67;
		
		 int len = arr.length;
		 
		  Arrays.sort(arr);
 		
	    int index = BinarySearch( arr ,len,data);
	    
	     System.out.println(index);
	     
	     if(index == -1){
	         System.out.println(data + " not found in array");
	     }else{
	         System.out.println(data + " found in array index : " + index);
	     }
	
	}

}
--------------------------------------------------------------------------------------------------------------------------------------------------


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
    public static int BinarySearch(int arr[],int n, int x){
        
        int start = 0;
        int end = n-1;
        
        System.out.println(Arrays.toString(arr)); 
       
      
        
        while(start<=end){
            
            int mid = start + (end - start)/2;
            
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x) {
                end = mid -1;
            }else{
                start = mid + 1;
            }
            
        }
        
        return -1;
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {1,2,3,5,67,23,11,23,45};
		
		int data = 67;
		
		 int len = arr.length;
		 
		  Arrays.sort(arr);
 		
	    int index = BinarySearch( arr ,len,data);
	    
	     System.out.println(index);
	     
	     if(index == -1){
	         System.out.println(data + " not found in array");
	     }else{
	         System.out.println(data + " found in array index : " + index);
	     }
	
	}
}

