package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {

        var maxvalue : Int
        var minvalue : Int
        maxvalue = input.max()!!
        minvalue = input.min()!!
        var summa = input.sum()
        var minsumArray=summa-maxvalue
        var maxsumArray=summa-minvalue
        return arrayOf(minsumArray, maxsumArray).toIntArray()


    }
}
