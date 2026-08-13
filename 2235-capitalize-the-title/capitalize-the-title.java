class Solution {
    public String capitalizeTitle(String title) {
    String [] arr = title.split(" ");
    StringBuilder ans = new StringBuilder();
    for(int i=0;i<arr.length;i++){
    String temp = arr[i].toLowerCase();
    if(temp.length()<=2){
        ans.append(temp);
    }
    else{
    char t = temp.charAt(0);
    ans.append(Character.toUpperCase(t));
    for(int j = 1;j<temp.length();j++){
        char t1 = temp.charAt(j);
        ans.append(t1);
    }
    }
    if(i<arr.length-1){
        ans.append(" ");
    }
    }
    return ans.toString();
    }
}