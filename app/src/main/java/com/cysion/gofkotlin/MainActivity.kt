package com.cysion.gofkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvStrategy.setOnClickListener {
            startActivity<StrategyActivity>()
        }
        tvObsever.setOnClickListener {
            startActivity<ObsevableActivity>()
        }
        tvCommand.setOnClickListener {
            startActivity<CommandActivity>()
        }
        tvBuilder.setOnClickListener {
            startActivity<BuilderActivity>()
        }
        tvDecorate.setOnClickListener {
            startActivity<DecorActivity>()
        }


    }
}
