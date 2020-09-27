package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows
import kotlin.IllegalArgumentException

internal class CalculatorTest {

    @Test
    @DisplayName("2 * 3 で 6 が返却される")
    fun multiply_test01() {
        val sut = Calculator()
        val actual = sut.multiply(2, 3)
        val expected = 6
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    @DisplayName("3 * 0 で 0 が返却される")
    fun multiply_test02() {
        val sut = Calculator()
        val actual = sut.multiply(3, 0)
        val expected = 0
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    @DisplayName("6 / 2 で 3 が返却される")
    fun divide_test01() {
        val sut = Calculator()
        val actual = sut.divide(6, 2)
        val expected = 3.0
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    @DisplayName("3 / 2 で 1.5 が返却される")
    fun divide_test02() {
        val sut = Calculator()
        val actual = sut.divide(3, 2)
        val expected = 1.5
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    @DisplayName("3 / 0 で 例外 が返却される")
    fun divide_test03() {
        val sut = Calculator()

        assertThrows<IllegalArgumentException> {
            sut.divide(3, 0)
        }
    }
}