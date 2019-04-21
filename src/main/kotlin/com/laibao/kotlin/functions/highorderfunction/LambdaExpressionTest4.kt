package com.laibao.kotlin.functions.highorderfunction

fun main() {
    longOperationAsync(10,::hideProgress)

    longOperationAsync(100){ hideProgress()}
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





