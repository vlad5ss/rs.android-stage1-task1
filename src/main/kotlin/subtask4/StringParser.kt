package subtask4

class StringParser {


    fun getResult(inputString: String): Array<String> {
        var array = arrayOf<String>()
        val helpList = mutableListOf<String>()
        var textString = inputString
        textString = textString.replace(Regex("[<(]"), "<<")
        textString = textString.replace("[", "<<", ignoreCase = true)
        textString = textString.replace(Regex("[>)]"), ">>")
        textString = textString.replace("]", ">>", ignoreCase = true)
        val pattern2 = Regex(" ")  // separate for white-spaces
        val ans: List<String> = pattern2.split(textString)
        helpList.addAll(ans)
        println(helpList)
        val filtered = helpList.filter { it.startsWith('<') }.filter { it.endsWith('>') }
        println(filtered)
        helpList.addAll(filtered)
        return helpList.toTypedArray()


    }
}