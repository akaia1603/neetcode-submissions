class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
            char[] sArrays = s.toCharArray();
            char[] tArrays = t.toCharArray();
            Arrays.sort(sArrays);
            Arrays.sort(tArrays);
        if(Arrays.equals(sArrays, tArrays)) {
            return true;
        }
        return false;
    }
}
