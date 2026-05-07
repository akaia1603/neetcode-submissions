class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}
        ans = []
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in hashMap:
                ans.append(hashMap.get(diff))
                ans.append(i)
                return ans
            hashMap[nums[i]] = i
        return
        


        