class Solution
{
    public void sort012(int a[], int n)
    {
        int low = 0, mid = 0, high = n - 1;
        
        // Iterate over the array
        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    // Swap the element at 'mid' with the element at 'low'
                    swap(a, low++, mid++);
                    break;
                case 1:
                    // Move the 'mid' pointer forward
                    mid++;
                    break;
                case 2:
                    // Swap the element at 'mid' with the element at 'high'
                    swap(a, mid, high--);
                    break;
            }
        }
    }

    private void swap(int ar[], int x, int y) {
        int t = ar[x];
        ar[x] = ar[y];
        ar[y] = t;
    }
}
