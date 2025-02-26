fun main() {
    try
    {
        println("Введите букву графика (а - г):")
        val letter = readln()
        println("Введите значение x:")
        val x = readln().toDouble()

        val y = when {
            letter == "а" -> {
                when {
                    x == -1.0 || x == 1.0 -> 0.0
                    x in -0.9..-0.1 -> 1 - Math.abs(x)
                    x in 0.1..0.9 -> 1 - x
                    x > 1 -> x - 1
                    else -> "Ошибка: число x вне графика"
                }
            }
            letter == "б" -> {
                when {
                    x in -0.9..-0.1 -> 1 - Math.abs(x)
                    x in 0.0..3.0 -> 1.0
                    x in 3.1..3.9 -> 1 - (x - 3)
                    x == -1.0 || x == 4.0 -> 0.0
                    else -> "Ошибка: число x вне графика"
                }
            }
            letter == "в" -> {
                when {
                    x == -1.0 || x == 1.0 -> 0.0
                    x == 0.0 || x == 3.0 -> 1.0
                    x in -0.9..-0.1 -> 1 - Math.abs(x)
                    x in 0.1..0.9 -> 1 - x
                    x in 1.1..2.9 -> (x - 1) / 2
                    else -> "Ошибка: число x вне графика"
                }
            }
            letter == "г" -> {
                when {
                    x == -1.0 -> 0.0
                    x in -0.9..-0.1 -> 1 - Math.abs(x)
                    x in 1.0..2.0 -> 1.0
                    x > 2 -> x - 1
                    else -> "Ошибка: число x вне графика"
                }
            }
            else -> "Ошибка: буква введена не верно"
        }
        println("Результат на графике $letter при значении x - $x : $y")
    }
    catch (e: Exception)
    {
        println("Ошибка: ${e.message}")
    }
}