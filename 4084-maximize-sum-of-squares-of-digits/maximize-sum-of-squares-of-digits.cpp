class Solution {
public:
    string maxSumOfSquares(int num, int sum) {
      string ans = "";
      int nine = sum/9;
      sum = sum%9;
      while(nine!=0){
        ans+='9';
        nine--;
      } 
      if(sum!=0){
        ans+=to_string(sum);
      } 
      while(ans.size()<num){
        ans+='0';
      }
      return ans.size()==num?ans:"";
    }
};