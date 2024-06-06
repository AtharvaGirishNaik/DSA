class Solution {
    int arr[];

    int[] sortArr(int[] arr, int n) {
        this.arr = arr;
        quicky(arr, 0, n - 1); // Start the quicksort process
        return arr;
    }

    // Recursive quicksort function
    private void quicky(int[] a, int l, int h) {
        if (l < h) { // Base case: if the subarray has one or no elements, it is already sorted
            int p = partition(a, l, h); // Find the partition index
            quicky(a, l, p - 1); // Recursively sort the left subarray
            quicky(a, p + 1, h); // Recursively sort the right subarray
        }
    }

    // Partitioning function
    private int partition(int[] a, int l, int h) {
        int pivot = a[h]; // Choose the last element as the pivot
        int i = l - 1; // Initialize the smaller element index

        for (int j = l; j < h; j++) { // Loop through the array
            if (a[j] <= pivot) { // If the current element is less than or equal to the pivot
                i++; // Increment the smaller element index
                swap(a, i, j); // Swap the elements at i and j
            }
        }

        swap(a, i + 1, h); // Swap the pivot element with the element at i + 1
        return i + 1; // Return the partition index
    }

    // Function to swap two elements in an array
    private void swap(int[] a, int x, int y) {
        int t = a[x]; // Temporary variable to hold one of the elements
        a[x] = a[y]; // Swap the elements
        a[y] = t; // Complete the swap
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {5, 3, 8, 6, 2}; // Example array
        int n = arr.length; // Length of the array
        arr = solution.sortArr(arr, n); // Sort the array
        for (int num : arr) { // Print the sorted array
            System.out.print(num + " ");
        }
    }
}


// class Solution {
//     int arr[];

//     int[] sortArr(int[] arr, int n) {
//         this.arr = arr;
//         quicky(arr, 0, n - 1); // Start the quicksort process
//         return arr;
//     }

//     // Recursive quicksort function
//     private void quicky(int[] a, int l, int h) {
//         if (l < h) { // Base case: if the subarray has one or no elements, it is already sorted
//             int p = partition(a, l, h); // Find the partition index
//             quicky(a, l, p - 1); // Recursively sort the left subarray
//             quicky(a, p + 1, h); // Recursively sort the right subarray
//         }
//     }

//     // Partitioning function
//     private int partition(int[] a, int l, int h) {
//         int pivot = a[h]; // Choose the last element as the pivot
//         int i = l - 1; // Initialize the smaller element index

//         for (int j = l; j < h; j++) { // Loop through the array
//             if (a[j] <= pivot) { // If the current element is less than or equal to the pivot
//                 i++; // Increment the smaller element index
//                 swap(a, i, j); // Swap the elements at i and j
//             }
//         }

//         swap(a, i + 1, h); // Swap the pivot element with the element at i + 1
//         return i + 1; // Return the partition index
//     }

//     // Function to swap two elements in an array
//     private void swap(int[] a, int x, int y) {
//         int t = a[x]; // Temporary variable to hold one of the elements
//         a[x] = a[y]; // Swap the elements
//         a[y] = t; // Complete the swap
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[] arr = {5, 3, 8, 6, 2}; // Example array
//         int n = arr.length; // Length of the array
//         arr = solution.sortArr(arr, n); // Sort the array
//         for (int num : arr) { // Print the sorted array
//             System.out.print(num + " ");
//         }
//     }
}










