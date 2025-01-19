package array

fun reverseArray(arr: Array<Int>) {

    if (arr.isEmpty()) {
        println("Array is empty")
        return
    }
    println("original arr: ${arr.joinToString()}")

    var left = 0
    var right = arr.lastIndex

    while (left <= right) {

        val temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp

        left++
        right--

    }

    println("reverse arr: ${arr.joinToString()}")

}