class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(forts[i] == 1 || forts[i] == -1){
                int maxd = 0;
                for(int j = i + 1; j < n; j++){
                    if(forts[j] == 0){
                        maxd++;
                    }
                    if(forts[j] == 1 || forts[j] == -1){
                        if(forts[j] != forts[i]){
                            max = Math.max(max, maxd);
                        }
                        break;
                    }
                }
            }
        }
        return max;
    }
}