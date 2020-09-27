package repository

import domain.Order

open class OrderRepository {
    open fun search(orderNumber: Int): Order {
        return Order(1, 1)
    }

    open fun save(newOrder: Order) {
        // save the order.
    }
}