fun main() {
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)

    // Solution 1: Using an iterator
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list2) // Output: [1, 3, 5]

    // Solution 2: Creating a new list
    val list3 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = mutableListOf<Int>()
    for (i in list3) {
        if (i % 2 != 0) {
            newList.add(i)
        }
    }
    println(newList) // Output: [1, 3, 5]
    
    //Solution 3: Using removeIf
    val list4 = mutableListOf<Int>(1,2,3,4,5)
    list4.removeIf {it % 2 == 0}
    println(list4) // Output: [1,3,5]
} 