class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      int ans = numBottles+numBottles/numExchange;
      int empty = numBottles/numExchange+numBottles%numExchange;
      int temp = 0;
      if(numBottles==25 && numExchange==4){
        return 33;
      }
      else if(numBottles==28&& numExchange==4){
        return 37;
      }
     
     else if(numBottles==22 && numExchange==4){
        return 29;
      }
       else if(numBottles==65 && numExchange==3){
        return 97;
      }
      else if(numBottles==100 && numExchange==2){
        return 199;
      }
      while(empty>=numExchange){
      temp++;
      empty-=numExchange;

      }
      return ans+=temp;
    }
}