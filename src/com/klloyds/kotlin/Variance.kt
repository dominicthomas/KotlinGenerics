package com.klloyds.kotlin

import java.util.ArrayList

fun main(args: Array<String>) {

    // Covariance - Subtype ok
    val animal: Animal = Dog() // ok
    // val dog: com.klloyds.kotlin.Dog = com.klloyds.kotlin.Animal() // not ok
    // val dog = com.klloyds.kotlin.Animal() as com.klloyds.kotlin.Dog // not ok - ClassCastException :(
    // com.klloyds.kotlin.printName(animal) // ok


    // Kotlin - Declaration-site com.klloyds.java.Variance

    // Covariance - Generics with "out" keyword / same as "extends"
    val integers: ArrayList<Int> = arrayListOf(1, 2, 3)
    val numbers: ArrayList<out Number> = integers
    val number: Number = numbers[0] // We can read from a generic structure
    //numbers.add(1) // not ok


    // Contravariance - Generics with "in" keyword / same as "super"
    val numbers1: ArrayList<Number> = arrayListOf(1, 2, 3)
    val integers1: ArrayList<in Int> = numbers1
    integers1.add(0, 4) // We can write to a generic structure
    //val number1: Number = integers1[0] // not ok

    // Invariance

}

open class Animal
class Dog : Animal()

fun printName(animal: Animal) {
    println(animal.javaClass.simpleName)
}
