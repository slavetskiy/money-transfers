import kotlin.math.*

fun main() {
    println("Введите сумму перевода в копейках")
    val amount = readLine()!!.toInt()
    val commission = if (round(amount * 0.0075) < 3500) 3500 else round(amount * 0.0075).toInt()
    print("Комиссия составит: $commission коп.")
}