package com.cysion.gofkotlin.builder

/**
 * Created by xianshang.liu on 2017/6/16.
 */
private data class APhone(var brand: String, var memory: Int, var screen: Float) {

}

class PhoneBuilder() {
    var brand: String = ""
    var memory: Int = 0
    var screen: Float = 1f
    fun build(): String {
        if (memory < 3) {
            return "memory 不能小于3"
        }
        return APhone(brand, memory, screen).toString()
    }
}