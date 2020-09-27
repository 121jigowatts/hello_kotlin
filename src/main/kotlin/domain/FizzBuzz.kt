package domain

class FizzBuzz {
    fun execute(param: Int): String {
        return when {
            param % 15 == 0 -> "FizzBuzz"
            param % 3 == 0 -> "Fizz"
            param % 5 == 0 -> "Buzz"
            else -> param.toString()
        }
    }
}