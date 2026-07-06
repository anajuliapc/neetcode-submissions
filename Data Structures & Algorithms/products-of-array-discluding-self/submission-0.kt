class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val prefix = IntArray(n) { 1 }
        val suffix = IntArray(n) { 1 }

        for (i in 1 until n) {
            prefix[i] = prefix[i-1] * nums[i-1]
        }
        println(prefix.contentToString())
        for (j in n-2 downTo 0) {
            suffix[j] = suffix[j+1] * nums[j+1]
        }
        println(suffix.contentToString())
        println(nums.contentToString())
        val result = IntArray(n)

        for(k in 0 until n) {
            result[k] = prefix[k] * suffix[k]
        }
        return result
    }
}
