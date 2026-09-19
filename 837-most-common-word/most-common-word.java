import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < paragraph.length(); i++){
            char ch = paragraph.charAt(i);
            if(Character.isLetter(ch)) s.append(Character.toLowerCase(ch));
            else s.append(' ');
        }
        String[] words = s.toString().split(" ");
        HashMap<String,Integer> mp = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(!words[i].equals("")) mp.put(words[i],mp.getOrDefault(words[i],0)+1);
        }
        int max = 0;
        String ans = "";
        for(String key : mp.keySet()){
            boolean isBanned = false;
            for(int i = 0; i < banned.length; i++){
                if(key.equals(banned[i])){
                    isBanned = true;
                    break;
                }
            }
            if(!isBanned && max < mp.get(key)){
                max = mp.get(key);
                ans = key;
            }
        }
        return ans;
    }
}