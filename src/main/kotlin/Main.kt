fun main(args: Array<String>) {

    val result = twoSum(arrayOf(3, 2, 4).toIntArray(), 6)
    println("Program arguments: ${args.joinToString()}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {

//    nums.sort()
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target)
                return arrayOf(i,j).toIntArray()
        }
    }
    return arrayOf(0).toIntArray()
}