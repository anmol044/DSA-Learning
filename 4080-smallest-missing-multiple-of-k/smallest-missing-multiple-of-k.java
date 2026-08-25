class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int current = k;
        while(set.contains(current)){
            current += k;
        }
        return current;
    }
}