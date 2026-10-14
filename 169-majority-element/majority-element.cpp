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

    // sort(nums.begin(),nums.end()); 
    // return nums[nums.size()/2];

    // third approach

    /* Important Technique = Boyer moore's votting also*/
    int n = nums.size();
   int val = nums[0];
   int occ = 1;
   for(int i = 1;i<n;i++){
    if(occ==0){
    val = nums[i];
    occ+=1;
    }
    else if(val!=nums[i]){
        occ-=1;
        
    }
    else if(val==nums[i]){
        occ+=1;
    }
   
   }

    return val;
    }
};