package com.cysion.gofkotlin.command

/**
 * Created by xianshang.liu on 2017/6/16.
 */
class Worker {
    var str: String = ""
    fun addStr(s: Char) {
        str += s
    }

    fun addNum(a: Int) {
        str += a
    }

    fun back() {
        str = str.substring(0, str.length - 1)
    }
}
typealias command = (worker: Worker) -> Unit
var strCommand: command = { it.addStr('a') }
var numCommand: command = { it.addNum(9) }