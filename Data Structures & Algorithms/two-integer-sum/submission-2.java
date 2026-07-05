class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }

        int j=0;

        while(j<nums.length){
            if(hm.containsKey(target - nums[j])){
                if((hm.get(target - nums[j]) != j )){
                result[0] = j;
                result[1] =  hm.get(target - nums[j]);
                return result;
            }
            }
            j++;
        }
        return result;
    }
}
