fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.replaceAll { it * 2 }
    println(list2) // Output: [2, 4, 6, 8, 10]
    
    //Alternatively using for loop
    val list3 = mutableListOf(1,2,3,4,5)
    for(i in list3.indices){
        list3[i] *=2
    }
    println(list3) // Output: [2, 4, 6, 8, 10]
}