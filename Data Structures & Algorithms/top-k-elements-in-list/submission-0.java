class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        Queue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int key : map.keySet()){
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
        }
        
        while(k-- > 0){
            res[k] = pq.poll();
        }
        return res;
    }
}
