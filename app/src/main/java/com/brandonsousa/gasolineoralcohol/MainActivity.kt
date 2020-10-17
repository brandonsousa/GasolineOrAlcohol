package com.brandonsousa.gasolineoralcohol

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.brandonsousa.gasolineoralcohol.model.Price
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_main_act_calc.setOnClickListener(View.OnClickListener {
            val gas = edt_main_act_gas.text.toString()
            val alc = edt_main_act_alcohol.text.toString()
            val check = Price()
            check.gasoline = gas.toDouble()
            check.alcohol = alc.toDouble()

            tv_main_act_response.setText(check.calc())
        })

    }
}