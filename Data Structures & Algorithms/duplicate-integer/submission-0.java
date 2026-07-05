class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();

        int i =0;
        while(i < nums.length){
            if(m.containsKey(nums[i])){
                return true;
            }else{
                m.put(nums[i],1);
            }
            i++;
        }
        return false;
    }
}