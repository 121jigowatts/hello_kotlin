package domain

class Counter(var count: Int) {
    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }
}