package xiaomi.com.vipkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import xiaomi.com.trip.tripPlan

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dests.dropDownVerticalOffset = 120
        val destList = listOf("Hangzhou", "Tianjin", "Sanya")
        val destAdapter = ArrayAdapter<String>(this, R.layout.spinner_item, destList)
        dests.adapter = destAdapter

        dests.onItemSelectedListener = DestSelector(trip_plan, destList)

    }

    private class DestSelector(val tripPlanView: TextView, val destList: List<String>) : OnItemSelectedListener {

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            val planDetail = tripPlan(destList[position])
            tripPlanView.text = planDetail
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

}
