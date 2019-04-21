package com.laibao.kotlin.functions.highorderfunction

fun main() {
    longOperationAsync(10,::hideProgress)

    longOperationAsync(100){ hideProgress()}

    addLogs("Some operations"){
        println("我来了你在哪里啊")
    }

    addLogs("Sleeper") {
        Thread.sleep(1000)
    }

    //Usage
    ifSupportsLolipop {
        // Operation
        println()
    }
}

fun getAndFillList(onStart: () -> Unit = {}, onFinish: () -> Unit = {}){
        // code
}


fun longOperationAsync(a: Int, callback: ()->Unit) {
    // ...
    callback.invoke()
}


fun hideProgress() {
    println("我是金戈啊你是谁啊")
}


fun addLogs(tag: String, block: () -> Unit) {
    println("$tag started")
    val startTime = System.currentTimeMillis()
    block.invoke()
    val endTime = System.currentTimeMillis()
    println("$tag finished. It took " + (endTime - startTime))
}


fun ifSupportsLolipop(block: () -> Unit) {

    if (true) {
        block()
    }
}
