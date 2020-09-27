package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {

    @Test
    @DisplayName("1が渡されたとき1が返却される")
    fun execute_01() {
        val sut = FizzBuzz()
        val actual = sut.execute(1)
        val expected = "1"
        assertThat(actual).isEqualTo(expected)
    }
    @Test
    @DisplayName("3が渡されたときFizzが返却される")
    fun execute_02() {
        val sut = FizzBuzz()
        val actual = sut.execute(3)
        val expected = "Fizz"
        assertThat(actual).isEqualTo(expected)
    }
    @Test
    @DisplayName("5が渡されたときBuzzが返却される")
    fun execute_03() {
        val sut = FizzBuzz()
        val actual = sut.execute(5)
        val expected = "Buzz"
        assertThat(actual).isEqualTo(expected)
    }
    @Test
    @DisplayName("15が渡されたときFizzBuzzが返却される")
    fun execute_04() {
        val sut = FizzBuzz()
        val actual = sut.execute(15)
        val expected = "FizzBuzz"
        assertThat(actual).isEqualTo(expected)
    }
}