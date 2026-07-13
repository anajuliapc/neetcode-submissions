class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = hashSetOf<Int>()
        var result = false
        for (num in nums) {
            if (!seen.add(num)) {
                result = true
            }
        }
        return result
    }
}