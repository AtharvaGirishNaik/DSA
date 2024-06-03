Given an 0-indexed array of integers arr[] of size n, find its peak element and return it's index. An element is considered to be peak if it's value is greater than or equal to the values of its adjacent elements (if they exist).
class Solution{
	public int peakElement(int[] arr,int n){
        int p=arr[0];
        int pi=0;
       for(int i = 0; i < n; i++){
           if(arr[i]>=p){
               p=arr[i];
               pi=i;
           }
       }
       return pi;
    }
}
