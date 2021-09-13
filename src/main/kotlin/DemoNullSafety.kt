class DemoNullSafety {
    fun declaringVars() {
        var nullable: String?
        nullable = null

        var nonNullable: String
//        nonNullable = null
    }

    fun nullChecks(input: String?) {
//        var length = input.length
//        var length = input!!.length    // length is not nullable
        val length = input?.length    // length is nullable
        println("length: $length")
        val length2 = input?.length ?: 0
        println("length2: $length2")
    }

    fun stringInterpolation(name: String) {
        println("Hello $name")
    }
}

fun main() {
    val demo = DemoNullSafety()

    demo.declaringVars()

    demo.nullChecks("coucou")
    demo.nullChecks(null)

    demo.stringInterpolation("yoyo")
}