
// Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.

class Solution
{
    ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        HashMap<Integer,Integer> hp = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        int  i = 0;
        
        for(i = 0 ; i < k ; i++){
            hp.put(a[i] , hp.getOrDefault(a[i] , 0) + 1);
            //If element is found then the element is get i.e returned else it returns the default value i.e the second parameter
        }
        
        
        result.add(hp.size());
        
        
        for(i = k ; i < n ; i++){
            if(hp.get(a[i - k]) == 1){
                hp.remove(a[i - k]);
                //Discard the element if ocunt is 1 and we moved out of the window
            }
            else{
                hp.put(a[i - k] , hp.get(a[i - k]) - 1);
                //Reducing element count
            }
            hp.put(a[i] , hp.getOrDefault(a[i],0)+1);
            
            
            
            result.add(hp.size());
            //It signifies that the map has the specified number of unique elements at the current window i.e as the elements are keys and n.o is value, size of map at each iterationnis the unique elements in hat window
            
        }
        
        return result;
    }
}
