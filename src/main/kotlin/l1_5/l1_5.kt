package l1_5

fun main() {
    val timeInSpace = 69
    val minutes = timeInSpace / 60
    val seconds = timeInSpace % 60
    val formateTime = String.format("%02d:%02d", minutes, seconds)
    println(formateTime)
}