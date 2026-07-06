class Solution {
    public boolean isPalindrome(String s) {
        String r = s.replaceAll("[^A-Za-z0-9]","").toUpperCase();
        StringBuilder st = new StringBuilder(r);


        st = st.reverse();
        System.out.println(st);
        if(r.equals(st.toString())){
            return true;
        }else{
            return false;
        }

    }
}
