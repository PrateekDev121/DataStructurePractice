package array

fun findMaxMinInArray(arr:Array<Int>){

    if(arr.isEmpty()){
        println("Array is empty")
        return
    }

    var max = arr[0]
    var min = arr[0]

    for(element in arr){
        if(element > max ) max = element
        if(element < min ) min = element
    }

    println("Max: $max")
    println("Min: $min")


}