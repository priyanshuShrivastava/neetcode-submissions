class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();


        for(String words : strs){
            char[] ch = words.toCharArray();

            Arrays.sort(ch);
            String key = new String(ch);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(words);
        }
        return new ArrayList<>(map.values());

    }
}
