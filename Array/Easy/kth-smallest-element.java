class Solution{
    int a[];
    public int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        a=arr;
        quick(a,0,r);
        return a[k-1];
        
    } 
    private void quick(int a[],int ll,int hh){
        if(ll < hh){
        int pi=part(a,ll,hh);
        quick(a,ll,pi-1);
        quick(a,pi+1,hh);
        }
    }
    private int part(int ar[],int x,int y){
        int p=ar[y];
        int i=x-1;
        
        for(int j=x;j<y;j++){
            if(ar[j] <= p){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,y);
        return i+1;
    }
    private void swap(int ar[],int x,int y){
        int t = ar[x];
        ar[x] = ar[y];
        ar[y] = t;
    }
}
