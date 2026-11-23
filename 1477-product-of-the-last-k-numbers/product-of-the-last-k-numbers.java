class ProductOfNumbers {
    ArrayList<Integer> getProduct ;
    public ProductOfNumbers() {
       getProduct = new ArrayList<>(); 
    }
    
    public void add(int num) {
        getProduct.add(num);
    }
    
    public int getProduct(int k) {
        int ans = 1;
        int len = getProduct.size()-1;
        while(k-->0){
            ans*=getProduct.get(len--);
        }
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */