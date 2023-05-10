package lesson_3_task_3

fun main() {
    println("Введи число на которые вы хотите выучить таблицу умножения: ")
    val number = readln().toInt()
    println("Таблица умножения на число $number: ")
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}