class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val frequencies = nums.groupBy { it }
        return frequencies.values.any { it.size > 1 }
    }
}
