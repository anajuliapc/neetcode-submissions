class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        // val groupedByLength = strs.groupBy { it.length }
        // val anagramsGroups = mutableListOf<List<String>>()

        // for (group in groupedByLength.values) {
        //     val groupByChar = group.groupBy { word ->
        //         word.groupingBy { char -> char }.eachCount()
        //     }
        //     anagramsGroups.addAll(groupByChar.values)
        // }

        // return anagramsGroups

        val groupedAnagrams = strs.groupBy { word -> 
            word.groupingBy { char -> char }.eachCount()
        }

        return groupedAnagrams.values.toList()
    }
}
