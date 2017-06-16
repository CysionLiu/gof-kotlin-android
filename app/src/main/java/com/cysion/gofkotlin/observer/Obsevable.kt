package com.cysion.kotlindemo.obsever

/**
 * Created by xianshang.liu on 2017/6/13.
 */
class Obsevable() {
    var lists: ArrayList<listener> = ArrayList()
    fun reg(p: listener) {
        lists.add(p)
    }

    fun unReg(p:listener) {
        lists.remove(p)

    }

    fun no(str: Int) {
        for (x in lists) {
            x.invoke(str)
        }
    }
}
typealias listener=(a: Int) -> Unit

