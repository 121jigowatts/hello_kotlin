package service

import com.nhaarman.mockitokotlin2.*
import domain.Order
import org.assertj.core.api.SoftAssertions
import org.junit.jupiter.api.Test
import repository.OrderRepository

internal class OrderServiceTest {
    private lateinit var orderRepository: OrderRepository
    private lateinit var sut: OrderService

    @Test
    fun search() {
        orderRepository = mock(name = "OrderRepositoryMock")
        whenever(orderRepository.search(any())).thenReturn(Order(1, 2))
        sut = OrderService(orderRepository)
        val actual = sut.search(1)

        SoftAssertions().apply {
            assertThat(actual.orderNumber)
                .`as`("Order Number")
                .isEqualTo(1)
            assertThat(actual.quantity)
                .`as`("Quantity")
                .isEqualTo(2)
        }.assertAll()
    }

    @Test
    fun save() {
        orderRepository = mock(name = "OrderRepositoryMock")
        sut = OrderService(orderRepository)
        sut.save(Order(1, 1))

        verify(orderRepository, times(1)).save(any())
    }
}