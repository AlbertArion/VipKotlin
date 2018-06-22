package xiaomi.com.trip.conveynace.tools

import xiaomi.com.trip.Schedule
import xiaomi.com.trip.conveynace.Tool
import xiaomi.com.trip.conveynace.ToolType

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-22.
 */

data class Train(val schedule: Schedule,
                 val type: ToolType = ToolType.Train)
    : Tool() {

    override fun getPrice(): Float = priceMap.getOrDefault(schedule.getRoute(), Float.MAX_VALUE)

    val priceMap = mapOf<CharSequence, Float>(
            "Beijing-Hangzhou" to 600F,
            "Beijing-Tianjin" to 25F,
            "Beijing-sanya" to 1000F)
}