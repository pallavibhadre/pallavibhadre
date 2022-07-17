package assigment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SSS {
	  public static void main(String[] args)  
	    { 
	    int []arr = {3, 4, 5, 3, 100, 1, 83, 54, 23, 20}; 
	   int n = arr.length;
	        int sumTotal = 0; 
	        for (int i = 0; i <n; i++) 
	            sumTotal += arr[i]; 
	       
	     System.out.println(sumTotal);
	 
		Arrays.asList(arr,Collections.reverseOrder());
		
	
		List<Integer> set1 = new ArrayList<Integer>();
	    List<Integer> set2 = new ArrayList<Integer>();
	    int set1Sum=0;
	    int set2Sum=0;
	    
	    for (int i: arr) {
	    if(set1Sum<=set2Sum) {
	    	 set1Sum= set1Sum+i;
	    	 set1.add(i);
	    	 
	    	 System.out.println("the subset1 is"+set1);
	    
	    } else {
	    	set2Sum= set2Sum+i;
	    	 set2.add(i);
	    	
	    	 System.out.println("the subset2 is"+set2);
		}
	    }
	    }
}  
    
  


