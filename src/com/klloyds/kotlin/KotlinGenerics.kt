package com.klloyds.kotlin

import java.util.*

fun main(args: Array<String>) {

    // Kotlin Arrays - Invariant :)
    val array1: Array<Int> = arrayOf(1, 2, 3)
    //val array2: Array<Number> = array1 // not ok


    // Kotlin Collections - Invariant
    val arrayList1: ArrayList<Int> = arrayListOf(1, 2, 3)
    val list1: List<Number> = arrayList1 // ok?
    //val list2: ArrayList<Number> = arrayList1 // not ok


    // Kotlin Generics(Wildcard) - Any'thing goes!
    val arrayList3: ArrayList<Any> = arrayListOf<Any>(1, ",", 3.0f)
    arrayList3.add(StringBuilder())
    val any: Any = arrayList3[0] // wow - discuss
}