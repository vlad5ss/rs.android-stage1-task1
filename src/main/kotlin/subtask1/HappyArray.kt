package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        var happyList = mutableListOf<Int>()
        happyList.addAll(sadArray.asList())
        var i = 1
        var value =0
        while (i <happyList.count()-1) {
            if(happyList[i]>happyList[i-1]+happyList[i+1]){
//               value = happyList[i]
                happyList.removeAt(i)
                i--
                if (i > 1) {
                    i--
                }
            }
            ++i
        }
        return happyList.toIntArray()




    }
}
