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

abstract class TripTool {
    companion object Factory {

        fun create(schedule: Schedule, type: TripType): TripTool {
            when (type) {
                TripType.SelfDriving -> return Car(schedule, type)
                TripType.ByTrain -> return Train(schedule, type)
                TripType.ByAir -> return Airplane(schedule, type)
                else -> return NoWay()
            }
        }

        fun feasible(schedule: Schedule): Boolean {
            val tool = create(schedule, TripType.ByAir)
            return schedule.haveEnoughBudget(tool.getPrice())
        }
    }

    abstract fun getPrice(): Int
}

enum class TripType {
    SelfDriving, ByTrain, ByAir
}