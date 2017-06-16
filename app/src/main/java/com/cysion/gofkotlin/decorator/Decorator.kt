package lmller.github.io.gofkotlin.decorator

interface Text {
    fun draw(): String
}

class DefaultText(var text: String) : Text {
    override fun draw(): String {
        return text
    }
}

fun Text.underline(decorated: Text.() -> String): String {
    return "_" + this.decorated() + "_"
}

fun Text.bracket(decorated: Text.() -> String): String {
    return "{" + this.decorated() + "}"
}


