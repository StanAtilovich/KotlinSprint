package lesson_1_task_5

fun main(){
    val timeInSpace = 69

    val minutes = timeInSpace / 10 / 6
    val seconds = timeInSpace / 1 % 60
    println("\n$minutes минута $seconds секунд")
}