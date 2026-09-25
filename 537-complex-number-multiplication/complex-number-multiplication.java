class Solution {
    public String complexNumberMultiply(String num1, String num2) {
    
    String [] a = num1.split("\\+");
    String [] b = num2.split("\\+"); 
    int real1  = Integer.parseInt(a[0]);
    int img1  = Integer.parseInt(a[1].replace("i",""));

    int real2  = Integer.parseInt(b[0]);
    int img2  = Integer.parseInt(b[1].replace("i",""));
    
    int ans_real = real1*real2-img1*img2;
    int ans_img = real1*img2+img1*real2;
    return ans_real+"+"+ans_img+"i";
    }
}