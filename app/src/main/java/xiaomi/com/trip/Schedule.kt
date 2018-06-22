package xiaomi.com.trip

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-22.
 */

class Schedule(val origin: String = "CHN", val dest: String, var budget: Float = 1000F) {

    var duration: Int = 1

    fun haveEnoughBudget(price: Float): Boolean = budget >= price

    fun getRoute(): CharSequence = StringBuilder().append(origin).append("-").append(dest)
}