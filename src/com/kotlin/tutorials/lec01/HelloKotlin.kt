package com.kotlin.tutorials.lec01

class HelloKotlin {
}


fun main(args: Array<String>) {
    val a = 1  // 1 , Int 类型，Koltin 中没有原始类型，一切类型都是对象类型。
    println(a)
    // a = a + 1 // val cannot be reassigned

    var b = 1
    b = b + 1
    println(b)

    // String
    val s = "Kotlin"
    println(s.length)
    println(s[0])
    println(s.subSequence(0, 3))
    // Array
    val intArray = arrayOf(1, 2, 3, 4, 5)
    println(intArray)
    for (e in intArray) {
        println(e)
    }

    // List
    val list = listOf("Kotlin", "Java", "Scala", "C", "C++", "Python")
    println(list)
    for (e in list) {
        println(e)
    }
    // Map
    val map = hashMapOf(1 to "A", 2 to "B", 3 to "C")
    println(map)
    for (e in map) {
        println("${e.key} => ${e.value}")
    }
}