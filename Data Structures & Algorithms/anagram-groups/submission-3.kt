class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = HashMap<List<Int>, MutableList<String>>()

        for (word in strs) {
            val count = MutableList(26) { 0 }
            for (c in word) {
                count[c - 'a']++
            }
            res.getOrPut(count) { mutableListOf() }.add(word)
        }

        return res.values.toList()
    }
}
