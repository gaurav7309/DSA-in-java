class Solution {
    public int sumFourDivisors(int[] nums) {
    int n = nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    int sum = 0;
    for(int i = 0;i<n;i++){
    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    for(int ele : map.keySet()){
    ArrayList<Integer> arr = new ArrayList<>();
    for(int j = 1;j*j<=ele;j++){
    if(ele%j==0){
    arr.add(j);
     if (j != ele / j) {
        arr.add(ele / j);
         }
    }
    }
    if(arr.size()==4){
    int temp = 0;
    for(int i = 0;i<arr.size();i++){
    temp+=arr.get(i);
    }
    sum+=temp*map.get(ele);
    }
   
    }
    return sum;
    }
}