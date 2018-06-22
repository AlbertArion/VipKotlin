package xiaomi.com.trip.TripMode

import xiaomi.com.trip.Schedule
import xiaomi.com.trip.conveynace.Tool
import xiaomi.com.trip.conveynace.ToolType

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-22.
 */

class SelfDriving() {

    companion object plan {
        fun feasible(schedule: Schedule): Boolean {
            return schedule.haveEnoughBudget(Tool.create(schedule, ToolType.Car).getPrice())
        }
    }
}