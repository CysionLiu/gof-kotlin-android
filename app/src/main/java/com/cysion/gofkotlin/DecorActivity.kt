package com.cysion.gofkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_obsebal.*
import lmller.github.io.gofkotlin.decorator.DefaultText
import lmller.github.io.gofkotlin.decorator.bracket
import lmller.github.io.gofkotlin.decorator.underline

class DecorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decor)
        var text = DefaultText("装饰者")
        s1.setOnClickListener {
            result.text = text.draw()
        }
        s2.setOnClickListener {
            result.text = text.underline { text.draw() }//加下划线
        }
        s3.setOnClickListener {
            result.text = text.bracket { text.underline { text.draw() } }//加下划线，再加括号
        }
    }
}
