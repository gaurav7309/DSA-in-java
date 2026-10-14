class Solution {
    public String maxSumOfSquares(int num, int sum) {
  StringBuilder s = new StringBuilder();
    int nine = sum/9;
    sum = sum%9;
    while(nine!=0){
        s.append('9');
        nine--;
    }
    if(sum!=0){
    
   s.append(sum);

    }
    while(s.length()<num){
    s.append(0);
    }
    return s.length()==num?s.toString():"";
    }
}