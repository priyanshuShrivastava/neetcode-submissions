class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length() == t.length()){
                 char[] cS = s.toCharArray();
                 char[] cT = t.toCharArray();

                 Arrays.sort(cS);
                 Arrays.sort(cT);

                 if(Arrays.equals(cS,cT)){
                    return true;
                 }else{
                    return false;
                 }
            }else{
                return false;
            }
    }
}
