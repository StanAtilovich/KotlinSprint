package lesson_2_task_4

fun main() {
    val crystalWithoutBuff = 7
    val ironWithoutBuff = 11
    val buff = 0.2
    val crystalWithBuff = crystalWithoutBuff + (crystalWithoutBuff * buff)
    val ironWithBuff = ironWithoutBuff + (ironWithoutBuff * buff)
    println("Количество бонусной кристаллической руды: ${crystalWithBuff.toInt() - crystalWithoutBuff}")
    println("Количество бонусной железной руды: ${ironWithBuff.toInt() - ironWithoutBuff}")
}
