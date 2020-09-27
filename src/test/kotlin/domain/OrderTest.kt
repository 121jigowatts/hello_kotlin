package domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.SoftAssertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeEach

internal class OrderTest {
    private lateinit var sut: Order

    @BeforeEach
    fun setUp() {
        sut = Order(1, 1)
    }

    @Test
    fun constructor() {
        val actual = Order(2, 2)
        SoftAssertions().apply {
            assertThat(actual.orderNumber).isEqualTo(2)
            assertThat(actual.quantity).isEqualTo(2)
        }.assertAll()
    }

    @Test
    fun getOrderNumber() {
        assertThat(sut.orderNumber).isEqualTo(1)
    }

    @Test
    fun getQuantity() {
        assertThat(sut.quantity).isEqualTo(1)
    }
}