// You are given an array of size N having no duplicate elements. The array can be categorized into the following:
// 1.  Ascending
// 2.  Descending
// 3.  Descending Rotated
// 4.  Ascending Rotated
// Your task is to return which type of array it is and the maximum element of that array.

int arr1[] = { 4, 5, 6, 1, 2, 3 }; // Ascending rotated
        findType(arr1);
 
        int arr2[] = { 2, 1, 7, 5, 4, 3 }; // Descending rotated
        findType(arr2);
 
        int arr3[] = { 1, 2, 3, 4, 5, 8 }; // Ascending
        findType(arr3);
 
        int arr4[] = { 9, 5, 4, 3, 2, 1 }; // Descending
        findType(arr4);
class Solution {
    
    static pair maxNtype(long a[], long n) {
        int no = (int) n; // Convert long n to int
    
        int[] ar = new int[no];
        
        // Iterate through the long array and cast each element to an int
        for(int x = 0; x < a.length; x++) {
            ar[x] = (int) a[x];
        }
        
        int mx = ar[0]; // Initialize mx with the first element of ar
        int i = 0;
        
        // Find the maximum element of the array ar
        for (int z = 0; z < ar.length; z++) {
            if (ar[z] > mx) {
                mx = ar[z];
            }
        }
        
        // Check for ascending order
        while (i < no - 1 && ar[i] <= ar[i + 1]) {
            i++;
        }
        
        if (i == no - 1) {
            return new pair(1, mx); // Ascending order
        }
        
        // Check for descending order
        if (i == 0){
            
        
        while (i < no - 1 && ar[i] >= ar[i + 1]) {
            i++;
        }
        
        if (i == no - 1) {
            return new pair(2, mx); // Descending order
        }
        
        if (ar[0] > ar[i+1]) {
            return new pair(4, mx); // ascending rotated order
        }
        else{
            return new pair(3,mx);
        }//this one is unnecessary as it works without it
    }
        
        if(i < no-1 && ar[0] < ar[i+1]) {
                return new pair(3, mx);
        }
        return new pair(4,mx);
    }

}
