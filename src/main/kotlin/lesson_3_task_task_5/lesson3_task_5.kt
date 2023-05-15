package lesson_3_task_task_5

fun main() {
    val data = "D2-D4;0" // здесь хранится строка, полученная от игрока

    val parts = data.split(";") // разбиваем строку на составляющие
    val move = parts[0] // первая составляющая - сам ход
    val number = parts[1].toInt() // вторая составляющая - номер хода (переводим в целое число)

    val from = move.substring(0, 2) // откуда сделан ход (берем первые два символа)
    val to = move.substring(3, 5) // куда сделан ход (берем символы с 3 по 5)

    println("Ход из $from в $to на $number-ом шаге") // выводим результат
}