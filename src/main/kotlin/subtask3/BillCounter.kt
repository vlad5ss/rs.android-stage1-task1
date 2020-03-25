package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        var mutarray = mutableListOf<Int>()
        mutarray.addAll(bill.asList())

       var correctbill = 0;
        var realSum = 0
        var summa = mutarray.sum()
        correctbill = summa - mutarray[k]
        correctbill /= 2
         if (correctbill == b) {
            return   "Bon Appetit"
        } else {
            return  (b - correctbill).toString()
        }

    }
}
