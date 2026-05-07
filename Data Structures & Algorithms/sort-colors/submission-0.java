class Solution {
    public void sortColors(int[] nums) {
        int[] tempArray = new int[3];
        for(int num : nums){
            tempArray[num]++;
        }
        int index = 0;
        for(int i = 0; i < 3 ; i++){
            while(tempArray[i]-- > 0){
                nums[index++] = i;
            }
        }
    }
}