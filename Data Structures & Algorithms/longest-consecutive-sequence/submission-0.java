class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;

        int longest = 1;

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        for(int st : set){
            if(!set.contains(st - 1)){
                int cnt = 1;
                int x = st;
            

            while(set.contains(x + 1)){
                cnt = cnt + 1;
                x = x+1;
            }

            longest = Math.max(longest,cnt);
        }
        }
        return longest;
    }
}
