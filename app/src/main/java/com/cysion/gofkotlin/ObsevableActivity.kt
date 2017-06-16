package com.cysion.gofkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cysion.kotlindemo.obsever.Obsevable
import com.cysion.kotlindemo.obsever.listener
import kotlinx.android.synthetic.main.activity_obsebal.*
import org.jetbrains.anko.toast


class ObsevableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obsebal)
        var observer = Obsevable()
        s1.setOnClickListener {
            toast("加入一个观察者aaa1，加入观察者v3")
            observer.reg { result.text = "${result.text}-观察者aaa1得到事件$it" }
            observer.reg(v3)
        }
        s2.setOnClickListener {
            toast("加入一个观察者bbb2，除去观察者v3")
            observer.reg { result.text = "${result.text}-观察者bbb2得到事件$it" }
            observer.unReg(v3)
        }
        s3.setOnClickListener {
            observer.no(110)
        }
    }

    var v3: listener = { toast("v3得到事件$it") }
}
