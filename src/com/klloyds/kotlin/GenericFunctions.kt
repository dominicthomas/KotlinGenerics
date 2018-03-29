package com.klloyds.kotlin

fun main(args: Array<String>) {
    boxOf(1)

    val apply = boxOf("hello").apply {
        item = "goodbye"
    }
    //println(apply.item)
}

fun <T> boxOf(item: T): Box<T> {
    return Box(item)
}

inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}