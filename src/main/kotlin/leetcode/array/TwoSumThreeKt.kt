package leetcode.array

class TwoSumThreeKt {

    var map: HashMap<Int, Int> = HashMap()

    fun add(number: Int) {
        map[number] = map.getOrDefault(number, 0) + 1
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    fun find(value: Int): Boolean {

        for (num in map.keys) {
            val key = value - num
            if (map.contains(key)) {
                if (key == num) {
                    if (map[key]!! > 1)
                        return true
                } else {
                    return true
                }
            }
        }
        return false
    }
}
