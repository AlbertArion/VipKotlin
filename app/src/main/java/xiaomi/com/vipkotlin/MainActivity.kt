package xiaomi.com.vipkotlin

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import xiaomi.com.toplevel.hasValue
import xiaomi.com.toplevel.plus

class MainActivity : AppCompatActivity() {

    var image = null
    val EMPTY_STR = ""
    val helper = VipBusHelper.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textMain.setText("Hello, Kotlin !")
        textMain.setTextSize(40F)
        textMain.setTextColor(Color.RED)
        textMain.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

    override fun onResume() {
        super.onResume()

        /**
         * Static fun usage.
         */
        VipBusHelper.collect(User(name = "1", age = 12))

        /**
         * Member fun usage.
         */
        helper.haveFun(this)
        helper.haveMoreFun(this)

        /**
         * Extension usage.
         */
        val variable = "variable"
        variable.hasValue()

        /**
         * Infix usage.
         */
        println("Top-level infix fun usage: 1 plus 2 = ${1 plus 2}")

        /**
         * Higher-order funs & lambdas
         */
        helper.printMe()
    }

}
