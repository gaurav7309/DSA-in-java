class Solution {
public:
    string trimTrailingVowels(string s) {
    int n = s.size();
    string temp = "";
    for(int i = n-1;i>=0;i--){
        if(s[i]=='a'||s[i]=='o'|| s[i]=='i'||s[i]=='e'||s[i]=='u'){
            continue;
        }
        else{
          int x = 0;
          for(int j = i;j>=0;j--){
          temp+=s[j];
          x++;
          } 
          break; 
        }
    }
      // swap the string temp
    int p = 0; int q = temp.size()-1;
    reverse(temp.begin(),temp.end());
    return temp;
    }
};