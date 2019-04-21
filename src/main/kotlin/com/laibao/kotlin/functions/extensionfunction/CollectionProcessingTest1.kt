package com.laibao.kotlin.functions.extensionfunction

import kotlin.collections.ArrayList

fun main() {

    val filteredList = ArrayList<Student>()

    for (student in students) {
        if(student.passing) filteredList += student
    }

    //filteredList.forEach{println(it)}

    //Collections.sort(filteredList) { p1, p2 -> if(p1.grade > p2.grade) -1 else 1 }
    filteredList.stream().sorted { p1, p2 -> if(p1.grade > p2.grade) -1 else 1 }


    for (i in 0..2) {
        val student = filteredList[i]
        println(student)
    }



    students.filter { it.passing } // 1
            .sortedByDescending { it.grade } // 2
            .take(3) // 3
            .forEach(::println) // 4




    (1..10000000).filter { it % 3 == 0 }
                .onEach(::print) // Prints: 369
                .map { it / 3 }
                .forEach(::println) // Prints: 123
}


data class Student(
        val name: String,
        val grade: Double,
        val passing: Boolean
)

val students = listOf(
        Student("John", 4.2, true),
        Student("Bill", 3.5, true),
        Student("John", 3.2, false),
        Student("Aron", 4.3, true),
        Student("Jimmy", 3.1, true)
)