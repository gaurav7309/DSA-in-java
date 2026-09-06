class MyHashSet {
    ArrayList<Integer>  arr = new ArrayList<>();

    public MyHashSet() {
        
    }
    
    public void add(int key) {
    if(!arr.contains(key)){
      arr.add(key);  
    }
   
}
    public void remove(int key) {
    if(arr.contains(key)){
      arr.remove(Integer.valueOf(key));
    } 

    }
    
    public boolean contains(int key) {
       if(arr.contains(key)){
       return true;
    } 
    else{
        return false;
    }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */