class DemoMutability {
    fun mutability() {
        var mutable: Int = 1    // Explicit type declaration
        mutable = 3;
        val immutable = 1    // Type inference
//        immutable = 3;
    }
}