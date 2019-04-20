package com.laibao.kotlin.functions.basicfunction


fun main() {
    println("Hello, World!")

    val doubleValue = double(100)

    presentGently("Duck")

    presentGently(42)


    presentGentlyNullable(null)

    presentGentlyNullable(1)

    presentGentlyNullable("Str")


    val p = printSum1(1, 2)

    println(p is Unit) // Prints: true
    println(p == Unit) // Print: true
    println(p === Unit) // Print: true

    printAllStr("<",">" , "Hello", "World")


    // Usage
    printAllAnyType("A", 1232234, 'c',true,false) // Prints: A,1,c


    val texts = arrayOf("B", "C", "D")
    printAll(*texts) // Prints: Texts are: B,C,D


    printAllAnyType("A", *texts, "E")

    val square = square(100){a -> a * a}
    println("the square is $square")

    val formatted = textFormatted("hello, {name}", "Marcin")
    println(formatted) // Hello, Marcin


    println()
    println()

    //printValue("str", true, "!","aaaa")


    printValue("straaaaaaaaaa", suffix = "!") // Prints: (str)!
    println()
    println()
    printValue("str", inBracket = true) // Prints: (str)

    println()
    println()
    printValue("str", prefix = "Value is ") // Prints: Value is str
    println()
    println()
    printValue("str", prefix = "Value is ", suffix = "!! ") // Prints: Value is str!!
}

fun double(i: Int): Int {
    return 2 * i
}

fun printSum1(a: Int, b: Int) {
    val sum = a + b
    println(sum)
}

fun printSum2(a: Int, b: Int): Unit { // 1
    val sum = a + b
    print(sum)
}

fun presentGently(v: Any) {
    println("Hello. I would like to present you: $v")
}

fun presentGentlyNullable(v: Any?) {
    println("Hello. I would like to present you: $v")
}


fun sumPositive(a: Int, b: Int): Int {
    if(a > 0 && b > 0) {
        return a + b
    }
    return 0
}


fun printSum(vararg intNumbers:Int) = intNumbers.sum()

fun printAll(vararg texts: String) { //Inferred type of texts is Array<String>

    val allTexts = texts.joinToString(",")

    println("Texts are $allTexts")
}

fun printAll(vararg texts: String,strValue: String) {
    return
}

fun printAllStr(prefix: String, postfix: String, vararg texts: String) {
    val allTexts = texts.joinToString("|| ")

    println("$prefix $allTexts $postfix")
}


fun printAllAnyType(vararg texts: Any) {
    val allTexts = texts.joinToString(",") // 1
    println(allTexts)
}

fun square(x: Int,intFunction:(Int) -> Int) =  intFunction(x)


fun textFormatted(text: String, name: String) = text
        .trim()
        .capitalize()
        .replace("{name}", name)



fun printValue(value: String,
               inBracket: Boolean = true,
               prefix: String = "",
               suffix: String = "") {
                    println(prefix)
                    if (inBracket) {
                        println("(${value})")
                    } else {
                        println(value)
                    }
                    println(suffix)
}













































