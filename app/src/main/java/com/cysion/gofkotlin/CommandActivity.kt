package com.cysion.gofkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cysion.gofkotlin.command.Client
import com.cysion.gofkotlin.command.Worker
import com.cysion.gofkotlin.command.numCommand
import com.cysion.gofkotlin.command.strCommand
import kotlinx.android.synthetic.main.activity_command.*

class CommandActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_command)
        var client = Client(Worker())
        s1.setOnClickListener {
            client.execute(strCommand)
            result.text = "${client.show()}"
        }
        s2.setOnClickListener {
            client.execute(numCommand)
            result.text = "${client.show()}"
        }
        s3.setOnClickListener {
            client.undo()
            result.text = "${client.show()}"
        }
    }
}
