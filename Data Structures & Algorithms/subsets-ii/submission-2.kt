class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val subset = mutableListOf<Int>()
        nums.sort()

        fun backtrack(i: Int) {
            if (i == nums.size) {
                res.add(subset.toList())
                return
            }

            subset.add(nums[i])
            backtrack(i + 1)
            subset.remove(nums[i])

            var j = i
            while (j + 1 < nums.size && nums[j] == nums[j + 1]) {
                j++
            }

            backtrack(j + 1)
        }

        backtrack(0)
        return res
    }
}