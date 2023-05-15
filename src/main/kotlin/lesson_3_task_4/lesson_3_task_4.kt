package lesson_3_task_4

fun main() {
    println("Игрок 1 начал свой ход с..(Введите фигуру)")
    val piece = readlnOrNull()

    println("Введите с какой клетки начал 1 игрок с фигуры $piece")
    val startPosition = readlnOrNull()

    println("Введите 1 игрок поставил фигуру $piece на ")
    val endPosition = readlnOrNull()

    val move = "1 игрок пошел с фигурой $piece из $startPosition в $endPosition\n"
    println(move)

    println("Игрок 2 начал свой ход с..(Введите фигуру) ")
    val piece2 = readlnOrNull()

    println("Введите с какой клетки начал 2 игрок с фигуры $piece2")
    val startPosition2 = readlnOrNull()

    println("Введите 2 игрок поставил фигуру $piece2 на ")
    val endPosition2 = readlnOrNull()

    val move2 = "2 игрок пошел с фигурой $piece2 из $startPosition2 в $endPosition2"
    println(move2)

}