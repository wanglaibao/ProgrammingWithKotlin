package com.laibao.kotlin.functions.highorderfunction

import kotlin.concurrent.thread

/**
 *  The three most common cases when functions in arguments are used are
 *
 *          1: Providing operations to functions
 *
 *          2: The observer (listener) pattern
 *
 *          3: Callback after a threaded operation
 *
 */



class Task (val active:Boolean = false)

fun main() {

    val tasks = listOf(Task(), Task(), Task(), Task(true), Task(true))

    var visibleTasks = emptyList<Task>()

    for (task in tasks) {
        if (task.active) {
            visibleTasks += task
        }
    }


    // Usage
    longOperationAsync(
            longOperation = { Thread.sleep(1000L) },
            block = { println("After second") }
            // 5, Prints: After second
    )
    println("Now") // 6, Prints: Now


}

/**
 *
 * 1: Providing operations to function
 *
 *
 * This way of using higher-order functions is very important
 * and is very common in kotlin functional style
 */
private fun <T> filter(list: List<T>, predicate: (T)->Boolean) {

    var visibleTasks = emptyList<T>()

    for (elem in list) {
        if (predicate(elem)){
            visibleTasks += elem
        }
    }
}


var listeners: List<()->Unit> = emptyList() // 1


fun addListener(listener: ()->Unit) {
    listeners += listener // 2
}

fun invokeListeners() {
    for( listener in listeners) listener() // 3
}


/**
 * @param longOperation
 * @param block
 */
fun longOperationAsync(longOperation: ()->Unit, block: ()->Unit) {

//    Thread({ // 1
//        longOperation() // 2
//        //block() // 3
//        block.invoke()
//    }).start() // 4

    thread {
        longOperation()
        block.invoke()
    }

}













