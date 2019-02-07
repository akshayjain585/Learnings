package testScripts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void solve(int N, int[] A, int X) 
    { 
		int count = 0;
		for(int i=0; i<N; i++){
			if(A[i]==X){
				count++;
			}
		}	
		for(int i=0; i<count; i++){
			System.out.print("1"+" ");
		}
		
          int index = 0; 
          for (int i=0; i<A.length; i++){
        	  if (A[i] != X) {
             	 A[index] = A[i];
             	 index++;
              }      
          }
          for(int i=0; i<index; i++){
        	  System.out.print(A[i]+" ");
          }           
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,5,7,4,9,2,2};
		solve(7,A,2);

		
	}

}
