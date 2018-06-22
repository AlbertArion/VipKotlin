package xiaomi.com.trip.conveynace.tools

import xiaomi.com.trip.conveynace.Tool

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-22.
 */

class NoWay : Tool() {
    override fun getPrice(): Float = Float.MAX_VALUE
}