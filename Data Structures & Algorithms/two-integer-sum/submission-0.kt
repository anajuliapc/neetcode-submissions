class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()
        for (i in 0 until nums.size) {
            val currValue = nums[i]
            val complement = target - currValue
            val seenValue = seen[complement]
            seen[currValue] = i
            if (seenValue != null) {
                return intArrayOf(seenValue, i)
            }
        }
        return intArrayOf()
    }
}
