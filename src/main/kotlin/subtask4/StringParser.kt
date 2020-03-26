package subtask4

import java.io.File.separator

class StringParser {


    fun getResult(inputString: String): Array<String> {
        var array = arrayOf<String>()
        val helpList = mutableListOf<String>()
        var helpjoinList1 = mutableListOf<String>()
        var textString = inputString
        textString = textString.replace(Regex("[<(]"), "<<")
        textString = textString.replace("[", "<<", ignoreCase = true)
        textString = textString.replace(Regex("[>)]"), ">>")
        textString = textString.replace("]", ">>", ignoreCase = true)
        val pattern = Regex(" ")  // separate for white-spaces
        val ans: List<String> = pattern.split(textString)
        helpList.addAll(ans)
        var filtered = helpList.filter { it.startsWith('<') }.filter { it.endsWith('>') }
        var grave:String = ""
        for (name in filtered) {
            grave=grave+name
        }
        println(grave)
        grave = grave.toString().replace(Regex("[<<]"), "")
        grave = grave.toString().replace(Regex("[>>]"), ",")
        val pattern1 = Regex(",")  // separate for white-spaces
        val ans2: List<String> = pattern1.split(grave)
        val longerThan4 = ans2.filter { it.length > 2 }
        helpjoinList1.addAll(longerThan4)
        println(helpjoinList1)
        return helpjoinList1.toTypedArray()


    }
}