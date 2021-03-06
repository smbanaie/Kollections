package co.ilities

/**
 * Arrays
 */
val intArray: Array<Int> = arrayOf(1, 2, 3)
val primitiveIntArray: IntArray = intArrayOf(1, 2, 3)
val copyOfArray: Array<Int> = intArray.copyOf()
val partialCopyOfArray: Array<Int> = intArray.copyOfRange(0, 2)

/**
 * Lists
 */
val intList: List<Int> = listOf(1, 2, 3) //Or arrayListOf(1,2,3)
val emptyList: List<Int> = emptyList() // Or listOf()
val listWithNonNullElements: List<Int> = listOfNotNull(1, null, 3) // --> List(1,3)

/**
 * Sets
 */
val aSet: Set<Int> = setOf(1) // Or hashSetOf(1) / linkedSerOf(1)
val emptySet: Set<Int> = emptySet() // Or setOf() / hashSetOf() / linkedSetOf()

/**
 * Maps
 */
val aMap: Map<String, Int> = mapOf("hi" to 1, "hello" to 2) // Or mapOf(Pair("hi", 1) / hashMapOf("hi" to 1) / linkedMapOf("hi" to 1)
val emptyMap: Map<String, Int> = emptyMap() // Or mapOf()/hashMapOf()/linkedMapOf()
val defaultingMap: Map<String, Int> = aMap.withDefault { key -> if (key == "no") 1 else 999 }


/**
 * Black sheep, mutables
 */
val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
val mutableSet: MutableSet<Int> = mutableSetOf(1)
var mutableMap: MutableMap<String, Int> = mutableMapOf("hi" to 1, "hello" to 2)