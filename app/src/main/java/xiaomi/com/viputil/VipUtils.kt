package xiaomi.com.viputil

import xiaomi.com.toplevel.hasValue
import xiaomi.com.vipkotlin.VipBusHelper

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 *
 * Created by AlbertGao
 * on 18-6-5.
 */

class VipUtils {
    fun extensionScope() {
        val str = "str"
        str.hasValue()
        VipBusHelper().context
    }
}