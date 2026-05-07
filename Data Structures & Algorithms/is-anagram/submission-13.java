class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> countMap = new HashMap<>();
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        for(int i = 0; i < arrayS.length; i++){
            countMap.put(arrayS[i], 
            countMap.getOrDefault(arrayS[i], 0) + 1);
        }

        for(int i = 0; i < arrayT.length; i++){
            if(!countMap.containsKey(arrayT[i]) || countMap.get(arrayT[i]) == 0){
                return false;
            } else{
                countMap.put(arrayT[i], countMap.get(arrayT[i]) - 1);
            }
        }
        return true;
    }
}
