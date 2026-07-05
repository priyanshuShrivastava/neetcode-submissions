class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }

            HashMap<Character,Integer> sM = new HashMap<>();
            HashMap<Character,Integer> tM = new HashMap<>();

            for(int i=0;i<s.length();i++){
                sM.put(s.charAt(i), sM.getOrDefault(s.charAt(i),0) + 1);
                tM.put(t.charAt(i), tM.getOrDefault(t.charAt(i),0) + 1);
            }

            return sM.equals(tM);
    }
}
