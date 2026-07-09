class Solution {
    public boolean isValid(String s) {
        char[] newArray = s.toCharArray();
        int i = 0;
        int j = newArray.length - 1;
        while(i == j){
            if(newArray[i] != newArray[j]) return false;
            else{
                i++;
                j--;
            }
        }
        return true;

    }
}
