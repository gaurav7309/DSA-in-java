class Solution {
public:
    int majorityElement(vector<int>& nums) {
    //    int n = nums.size();
    //    unordered_map<int,int> mp;
    //    for(int i = 0;i<n;i++){
    //    mp[nums[i]]++;
    //    } 
    //   int temp = INT_MIN;
    //   int val = 0;
    //    for(auto key:mp){
    //     if(temp<key.second){
    //         temp = key.second;
    //         val = key.first;
    //     }
    //    }
    //    return val;
    // second approach forst sort then the middle element return 
    sort(nums.begin(),nums.end()); 
    return nums[nums.size()/2];
    }
};