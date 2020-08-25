package domain

class Person(private val name: String) {
    fun greeting(): String {
        return "Hello, I am $name."
    }
}