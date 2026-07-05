class Solution {
    public boolean isAnagram(String str1, String str2) {
        char[] c1 = str1.toCharArray();
        Arrays.sort(c1);

        char[] c2 = str2.toCharArray();
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            return true;
        }else {
            return false;
        }
    }
    
}
