class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
       Collections.sort(tasks,Collections.reverseOrder());
      Collections.sort(processorTime);
       int max = Integer.MIN_VALUE;
        int p = 0;
       for(int i = 0;i<processorTime.size();i++){

        int temp = 0;
        for(int j = 0+p;j<tasks.size();j++){
        max = Math.max(max,processorTime.get(i)+tasks.get(j));
        temp++;
        if(temp==3){
            break;
        }

        }
        p+=4;
       } 
       return max;
    }
}