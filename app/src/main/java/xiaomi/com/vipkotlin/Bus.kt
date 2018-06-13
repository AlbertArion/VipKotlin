package xiaomi.com.vipkotlin

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-5.
 */

data class Bus constructor(var name: String = "", var age: Int = 0) {
    init {
        println("Constructor init: Bus")
    }

    constructor(bus: Bus) : this() {
        name = bus.name
        age = bus.age
    }

    override fun toString(): String {
        return "Bus(name: $name, age: $age)";
    }
}