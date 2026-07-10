class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val res = mutableListOf(listOf<Int>())
        var prevIdx = 0
        var idx = 0

        for (i in nums.indices) {
            idx = if (i > 0 && nums[i] == nums[i - 1]) prevIdx else 0
            prevIdx = res.size
            for (j in idx until prevIdx) {
                val tmp = ArrayList(res[j])
                tmp.add(nums[i])
                res.add(tmp)
            }
        }

        return res
    }
}