class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        // val sizes = nums.groupBy { it }.mapValues { it.value.size }
        // return sizes.keys.sortedByDescending { 
        //     sizes[it]
        // }.take(k).toIntArray()

        val sizes = nums.asIterable().groupingBy { it }.eachCount()
        return sizes.keys.sortedByDescending { sizes[it] }.take(k).toIntArray()
    }
}
