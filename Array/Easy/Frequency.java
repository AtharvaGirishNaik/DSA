
class Solution{
    int findFrequency(int Arr[], int X){
        int c=0;
     for(int i = 0 ; i < Arr.length ; i++){
         if(Arr[i] == X){
             c++;
         }
     }   
     return c;
    }
}
