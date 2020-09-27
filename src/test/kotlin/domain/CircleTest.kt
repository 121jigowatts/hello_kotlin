package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CircleTest {
    @Test
    fun constructor() {
        assertThat(Circle(3.0).pi).isEqualTo(3.0)
    }

    @Test
    fun getArea() {
        val sut = Circle(3.14)
        val actual = sut.getArea(3)
        val expected = 28.26
        assertThat(actual).isEqualTo(expected)
    }
}