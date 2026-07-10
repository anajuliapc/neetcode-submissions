class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val subset = mutableListOf<Int>()

        fun dfs(i: Int) {
            // caso base
            if (i >= nums.size) {
                res.add(subset.toList())
                return
            }

            // decisao de incluir nums[index]
            subset.add(nums[i])
            dfs(i+1)

            // decisão de NÃO incluir nums[index]
            subset.remove(nums[i])
            dfs(i+1)
        }

        dfs(0)
        return res
    }
}
