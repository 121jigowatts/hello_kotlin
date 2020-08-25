package domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PersonTest {

    @Test
    fun greetingTest() {
        val expected = "Hello, I am Michel."
        val michel = Person("Michel")
        val actual = michel.greeting()

        assertEquals(expected, actual)
    }
}