package xiaomi.com.trip.conveynace.tools

import xiaomi.com.trip.conveynace.Tool
import xiaomi.com.trip.conveynace.ToolType

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-22.
 */

data class Car(val schedule: xiaomi.com.trip.Schedule,
               val type: ToolType = ToolType.Car)
    : Tool() {

    override fun getPrice(): Float = priceMap.getOrDefault(schedule.getRoute(), Float.MAX_VALUE)

    val priceMap = mapOf<CharSequence, Float>(
            "Beijing-Hangzhou" to 1200F,
            "Beijing-Tianjin" to 200F,
            "Beijing-sanya" to 3000F)

}