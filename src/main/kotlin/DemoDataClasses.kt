data class Person(val firstName: String, val lastName: String)

fun main() {
    val person = Person("Eddy", "Malou")
    println("Person: ${person.firstName} ${person.lastName}")

    val copy = person.copy(lastName = "Malou2")
    println("Copy: ${copy.firstName} ${copy.lastName}")
}