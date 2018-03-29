package com.klloyds.kotlin

fun main(args: Array<String>) {


    // Type Projection

    val dog: Box<Dog> = Box(Dog())
    dog.item = Dog() // set
    val item = dog.item // get
    // val animal: Box<Animal> = dog // not ok

    val box: Box<Animal> = Box(Animal())
    print(dog) // subtype ok
    print(box) // ok

    add(box, Dog())


    // Star Projection

    val anyBox = AnotherBox<Any>()
    val intBox = AnotherBox<Int>()
    val stringBox = AnotherBox<String>()
    var unknownBox: AnotherBox<*>

    unknownBox = anyBox // ok
    unknownBox = intBox // ok
    unknownBox = stringBox // ok

    val stringList = mutableListOf("1", "2", "3", "4")
    val intList = mutableListOf(1, 2)
    printSize(stringList) // prints: 4
    printSize(intList) // prints: 2
}

// ===========================

class Box<T>(var item: T) // Invariant

class AnotherBox<T>

fun print(boxed: Box<out Animal>) { // Covariant - Producer
    val animal: Animal = boxed.item
    //boxed.item = Animal() // not ok
    System.out.println(animal)
}

fun add(boxed: Box<in Animal>, animal: Animal) { // Contravariant - Consumer
    boxed.item = animal // ok
}


// ===========================


fun printSize(list: MutableList<*>) {
    println(list.size)
}