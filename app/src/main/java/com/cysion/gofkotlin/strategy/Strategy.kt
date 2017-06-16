package lmller.github.io.gofkotlin.strategy

typealias PlayVideo = () -> String

class Device(var name: String) {
    fun play(p: PlayVideo): String {
        return p()
    }
}

val tv: PlayVideo = {
    "用电视看视频"//作为返回值
}
val phone: PlayVideo = {
    "---用手机看视频---"
}
