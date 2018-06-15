package xiaomi.com.vipkotlin

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-5.
 */

data class User constructor(var name: String = "", var age: Int = 0) {
    init {
        println("Constructor init: Bus")
    }

    constructor(user: User) : this() {
        name = user.name
        age = user.age
    }

    override fun toString(): String {
        return "Bus(name: $name, age: $age)";
    }
}