class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapCount = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int buTru = target - nums[i];
            if(mapCount.containsKey(buTru)){
                return new int[] {mapCount.get(buTru), i};
            }
            mapCount.put(nums[i], i);
        }
        return new int[] {};
    }
    
}
