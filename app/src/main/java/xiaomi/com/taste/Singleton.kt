package xiaomi.com.taste

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-13.
 */

object Singleton : Man() {
    val tag = "single man"
    fun printMe() = println("I am ${xiaomi.com.taste.Singleton.tag}.")
}