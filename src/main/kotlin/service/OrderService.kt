package service

import domain.Order
import repository.OrderRepository

class OrderService(private val orderRepository: OrderRepository) {
    fun search(orderNumber: Int): Order {
        return orderRepository.search(orderNumber)
    }

    fun save(newOrder: Order) {
        orderRepository.save(newOrder)
    }
}