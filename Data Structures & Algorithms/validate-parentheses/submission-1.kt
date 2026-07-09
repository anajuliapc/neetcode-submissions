class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val closeToOpen = hashMapOf(')' to '(', ']' to '[', '}' to '{')

        for (c in s) {
            if (c in closeToOpen) {
                if (stack.isNotEmpty() && stack.last() == closeToOpen[c]) {
                    stack.removeLast()
                } else {
                    return false
                }
            } else {
                stack.addLast(c)
            }
        }

        return stack.isEmpty()
    }
}