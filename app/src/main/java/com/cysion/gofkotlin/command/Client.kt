package com.cysion.gofkotlin.command

/**
 * Created by xianshang.liu on 2017/6/16.
 */
class Client(var aWorker: Worker) {
    var comList = ArrayList<command>()
    fun execute(com: command) {
        com.invoke(aWorker)
        comList.add(com)
    }

    fun undo() {
        if (comList.size == 0) {
            return
        }
        aWorker.back()
        comList.remove(comList[comList.size - 1])
    }

    fun show(): String {
        return aWorker.str
    }
}