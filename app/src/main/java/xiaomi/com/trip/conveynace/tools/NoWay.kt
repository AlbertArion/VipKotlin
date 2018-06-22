package xiaomi.com.trip.conveynace.tools

import xiaomi.com.trip.conveynace.TripTool

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-22.
 */

class NoWay : TripTool() {
    override fun getPrice(): Int = Int.MAX_VALUE
    override fun toString(): String {
        return "Trip: No way!\n"
    }
}