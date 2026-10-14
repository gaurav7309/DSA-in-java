class Solution {
public:
    vector<int> permutation(vector<int>& nums,vector<int>& arr,int i ){
     if(i==nums.size()){
     return arr;
     }
     arr.push_back(nums[nums[i]]);
     return permutation(nums,arr,i+1);
     }
    vector<int> buildArray(vector<int>& nums) {
      vector<int>  v;
     return  permutation(nums,v,0); 
    }
};