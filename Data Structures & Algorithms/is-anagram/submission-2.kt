class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false;

        val sortedS = String(s.toCharArray().apply { sort() })
        val sortedT = String(t.toCharArray().apply { sort() })

        return sortedS == sortedT;
    }
}
