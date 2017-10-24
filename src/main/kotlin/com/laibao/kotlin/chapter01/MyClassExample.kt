package com.laibao.kotlin.chapter01

/**
 * Created by jinge on 2017/10/24.
 */



class MyClassExample(stringParam:String) {
    var myString:String
    val valToAppend: String = "42"
    init {
        myString = stringParam
        myString += valToAppend;
    }
    constructor(stringParam:String, myInt:Int) : this(stringParam){
        myString += myInt.toString();
    }
}

//fun main(args: Array<String>) {
//    var myClass = MyClassExample("test");
//    println(myClass.myString); // Prints test42
//
//    var myClass2 = MyClassExample("test", 43);
//    println(myClass2.myString); //Prints test4243 !!!!
//}


open class Base1{};

class Derived1 : Base1() {};

open class Base2(param:Int){};

class Derived2(param:Int) : Base2(param) {};


open class Base3(param:Int){};
class Derived3 : Base3 {
    constructor(param:Int) : super(param){}
}

open class Base4 {
    open fun baseFunc() {println("base"); }
};
class Derived4 : Base4() {
    override fun baseFunc() { println("derived"); }
}
//fun main(args: Array<String>) {
//    var derived = Derived4()
//    derived.baseFunc() // prints "derived"
//}



interface InterfaceA {
    fun methodA()
    fun methodB() {println("this is the defaule implemetation");}
};

class ClassA : InterfaceA {
    override fun methodA() { println("implemet the methodA in the interfaceA");}
}

fun main(args: Array<String>) {
    var classA = ClassA()
    classA.methodA()
    classA.methodB()
}

