class DemoExtensions {
    fun extensionFunction(input: Int) {
        fun Int.abs(): Int {
            return kotlin.math.abs(this)
        }

        println(input.abs())
    }
}

fun main() {
    val demoExtensions = DemoExtensions()
    demoExtensions.extensionFunction(-3)

//    val i = 3;
//    i.abs()
}