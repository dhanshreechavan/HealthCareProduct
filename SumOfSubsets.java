/* eight subsets of [5,1,6] are:
 * empty subset has XOR total of 0
 * [5] has XOR total : 5
 * [1] has XOr total:1
 */
package com.assignment;
public class SumOfSubsets {
	public static int xorSum(int arr[],int n) {
		
	int bits=0;
	for(int i=0;i< n;i++) 
	bits |= arr[i];
	int answer =bits *(int)Math.pow(2, n-1);
	
	return answer;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,6};
		int size=arr.length;
		
	System.out.println("Answer is:"+xorSum(arr,size));	
		
	}

}
