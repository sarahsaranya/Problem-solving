class FindSumPairs {
    int [] x1,x2;
    HashMap<Integer,Integer> m = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        x1 = nums1;
        x2 = nums2;
        for(int i : nums2){
            m.put(i,m.getOrDefault(i,0)+1);
        }
    }
    
    public void add(int index, int val) {
        m.put(x2[index] , m.getOrDefault(x2[index],0)-1);
        x2[index] += val;
        m.put(x2[index] , m.getOrDefault(x2[index],0)+1);
    }
    
    public int count(int tot) {
        int c= 0;
        for(int y: x1){
            c+= m.getOrDefault(tot - y,0);
        }

        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */