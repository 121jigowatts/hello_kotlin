package domain

class Circle(val pi: Double) {
    fun getArea(radius: Int): Double {
        return radius * radius * pi
    }
}