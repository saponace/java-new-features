class DemoFunctions {
    fun defaultParams(param: String = "yeye") {
        println("Parameter: $param")
    }

    fun namedParams(param1: String = "yeye2", param2: String) {
        println("Parameter 1: $param1, Parameter 2: $param2")
    }

    // Inline function declaration
    fun add(a: Int, b: Int) = a + b

    // Function parameter
    fun repeatFunction(f: (Int, Int) -> Int, a: Int, times: Int) {
        var res = 0
        for (i in 1..times) {
            res = f(a, res)
        }
        println(res)
    }

}

fun main() {
    val demoFunctions = DemoFunctions()
    demoFunctions.defaultParams("yup")
    demoFunctions.namedParams(param2 = "yaw")
    demoFunctions.add(13, 12)

    val add: (a: Int, b: Int) -> Int = { a, b -> a+b }
    demoFunctions.repeatFunction(add, 2, 4)    // Accepts lambdas
    demoFunctions.repeatFunction(DemoFunctions()::add, 3, 5)    // Accepts method references
}