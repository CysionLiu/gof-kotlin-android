package com.cysion.gofkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_strategy.*
import lmller.github.io.gofkotlin.strategy.Device
import lmller.github.io.gofkotlin.strategy.phone
import lmller.github.io.gofkotlin.strategy.tv

class StrategyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strategy)
        var device = Device("设备")
        s1.setOnClickListener {
            result.text = device.play(tv);
        }
        s2.setOnClickListener {
            result.text = device.play(phone);
        }
    }
}
