package xiaomi.com.taste.viputil

import xiaomi.com.taste.toplevel.hasValue
import xiaomi.com.taste.VipBusHelper

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