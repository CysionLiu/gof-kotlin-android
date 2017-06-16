package com.cysion.gofkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cysion.gofkotlin.builder.PhoneBuilder
import kotlinx.android.synthetic.main.activity_obsebal.*

class BuilderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder)
        s1.setOnClickListener {
            result.text = PhoneBuilder().apply {
                brand = "华为"
                memory = 3
                screen = 5.5f
            }.build()
        }
        s2.setOnClickListener {
            result.text = PhoneBuilder().apply {
                brand = "乐视"
                memory = 1
                screen = 5.5f
            }.build()
        }
    }
}
