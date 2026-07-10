class Solution {

    fun encode(strs: List<String>): String {
        return strs.joinToString("") { str ->
            "${str.length}#$str" 
        }
    }

    fun decode(str: String): List<String> {
        val res = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            var j = i
            while(str[j] != '#') {
                j++
            }
            var len = str.substring(i, j).toIntOrNull() ?: 0
            res.add(str.substring(j+1, j+1+len))
            i = j + 1 + len
        }
        return res
    }
}
