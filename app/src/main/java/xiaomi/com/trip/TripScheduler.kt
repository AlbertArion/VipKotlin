package xiaomi.com.trip

import xiaomi.com.trip.TripMode.ByAir

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-22.
 */

fun tripPlan() {
    var schedule: Schedule = Schedule(dest = "Hangzhou")
    ByAir.cost(schedule)
}