package xiaomi.com.vipkotlin

import android.app.Activity
import android.content.Context
import xiaomi.com.toplevel.hasValue

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-5-25.
 */

open class VipBusHelper {

    internal var context = null
    private var page = null
    private var history: String = "history"
    private var map: Map<String, Int> = mapOf("me" to 12, "you" to 13, "him" to 14, "her" to 15)

    companion object Factory {

        fun create(): VipBusHelper = VipBusHelper()

        fun collect(vararg args: Bus) {
            for (item in args) {
                println(item)
            }
        }
    }

    fun haveFun(context: Context) {
        val busStr: String = ""
        busStr.hasValue()
        busStr.isEmpty()
        val bus: Bus = Bus("", 1);
        println("Vip bus name = " + bus.name + ", bus age = " + bus.age)
    }

    fun haveMoreFun(act: Activity) {
        val busGroup = listOf<Bus>(Bus("global"), Bus(name = "china", age = 1), Bus("USA", age = 2), Bus("UK", 3))
        val oldest = busGroup.maxBy { it.age }
        println("The oldest is: $oldest")
        println("The top-level x = ${haveTopFun()}")
    }

    fun makeMapHaveFun() {
        map.mapValues { }
    }

    private fun haveNoFun(str: String): Int? {
        var value: Int? = null
        try {
            value = str.toInt()
        } catch (e: NumberFormatException) {
            e.printStackTrace()
        }
        return value
    }

    private fun haveTopFun(): Int {
        return x
    }

    private fun secret() = history.length

    private fun fooFun() {
        val foo = Foo()
        foo.nickname = "outer settled"
    }

    private fun sum(x: Int = 0, y: Int): Int {
        return x + y
    }

    private fun blockFun(): Boolean {
        /* Do sth.*/
        return true
    }

    private fun higherOrderPlus(a: Int, b: Int, f: (x: Int, y: Int) -> Int): Int {
        return f(a, b)
    }

    fun printMe() {
        Man.create()
        val lambdaResult = higherOrderPlus(1, 2, { a, b -> a + b })
        val funRefResult = higherOrderPlus(1, 2, Int::plus)
        println("The lambda sum of 1 and 2 is: $lambdaResult")
        println("The fun ref sum of 1 and 2 is: $funRefResult")
    }

}

// Top-level variables
val PI = 3.14
var x = Int.MIN_VALUE