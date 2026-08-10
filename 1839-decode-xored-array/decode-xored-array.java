class Solution {
    public int[] decode(int[] encoded, int first) {
    int n = encoded.length;
    int [] coded = new int [n+1];
    coded[0] = first;
    for(int i = 0;i<n;i++){
     coded[i+1] =  encoded[i]^coded[i];
    }
    return coded;
    }
}