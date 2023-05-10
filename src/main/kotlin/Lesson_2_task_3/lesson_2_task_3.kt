package Lesson_2_task_3

fun main() {
    val trainLeftHour = "9:39"
    val trainLeft = 9 * 60 + 39
    val trainOnTheWay = 457
    val arrivalTimeMinutes = trainLeft + trainOnTheWay
    println("Время прибытия поезда в минутах $arrivalTimeMinutes")
    val (hours, reminder) = minutesToHours(arrivalTimeMinutes)
    println("Поезд приехал в $hours часов $reminder минут")
}

fun minutesToHours(arrivalTimeMinutes: Int): Pair<Int, Int> {
    val hours = arrivalTimeMinutes / 60
    val remainder = arrivalTimeMinutes % 60
    return Pair(hours, remainder)
}