package lesson_2_task_5

import kotlin.math.pow

fun main() {
    fun calculateFutureValue(initialDeposit: Int, annualRate: Double, years: Int): Double {
        val rate = 1 + annualRate
        val compoundInterest = rate.pow(years.toDouble())
        return initialDeposit * compoundInterest
    }

    val futureValue = calculateFutureValue(70_000, 0.167, 20)
    println(String.format("Ваш вклад через 20 лет составит %.3f рублей", futureValue))
}
