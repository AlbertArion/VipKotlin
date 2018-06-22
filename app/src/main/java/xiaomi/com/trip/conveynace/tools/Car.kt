package xiaomi.com.trip.conveynace.tools

import xiaomi.com.trip.conveynace.TripTool
import xiaomi.com.trip.conveynace.TripType

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-22.
 */

data class Car(val schedule: xiaomi.com.trip.Schedule,
               val type: TripType = TripType.SelfDriving)
    : TripTool() {

    override fun getPrice(): Int = priceMap.getOrDefault(schedule.getRoute(), Int.MAX_VALUE)

    val priceMap = mapOf<String, Int>(
            "Beijing-Hangzhou" to 1200,
            "Beijing-Tianjin" to 200,
            "Beijing-sanya" to 3000)

    override fun toString(): String {
        return "Trip: $schedule \n type: $type \n cost: ${getPrice()}\n"
    }
}