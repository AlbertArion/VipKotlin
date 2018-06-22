package xiaomi.com.trip.conveynace

import xiaomi.com.trip.Schedule
import xiaomi.com.trip.conveynace.tools.Airplane
import xiaomi.com.trip.conveynace.tools.Car
import xiaomi.com.trip.conveynace.tools.NoWay
import xiaomi.com.trip.conveynace.tools.Train

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-22.
 */

abstract class Tool {
    companion object Factory {

        fun create(schedule: Schedule, type: ToolType): Tool {
            when (type) {
                ToolType.Car -> return Car(schedule, type)
                ToolType.Train -> return Train(schedule, type)
                ToolType.Airplane -> return Airplane(schedule, type)
                else -> return NoWay()
            }
        }
    }

    abstract fun getPrice(): Float
}

enum class ToolType {
    Car, Train, Airplane
}