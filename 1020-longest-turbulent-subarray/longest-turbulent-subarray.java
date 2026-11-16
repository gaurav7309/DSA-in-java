class Solution {
    public int maxTurbulenceSize(int[] arr) {
      int  n = arr.length;
      int max  =  1;
      int start = 0;
      for(int  end  = 0;end<n-1;end++){

      if(arr[end] < arr[end+1]){
        
        if(end>0 && arr[end-1] < arr[end]){ // for the condition if the false;
           start = end;
        }
         
        
      }
      else if(arr[end] > arr[end + 1]){

        if(end>0 && arr[end-1] > arr[end]){
            start = end;
        }
        }

            else{
          start = end+1;
           }
           max = Math.max(max,end-start+2);
        
      }
     return max;

     
    }
}