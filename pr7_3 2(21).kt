fun main()
{
    try {
        println("Введите длину диагонали:")
        val d = readln().toDouble()
        println("Введите длину большего основания:")
        val a = readln().toDouble()
        when
        {
            d <= 0 || a <= 0 -> println("Ошибка: Диагональ и основания должны быть положительные")
            d <= a -> println("Ошибка: Диагональ должна быть больше большего основания")
            else ->
            {
                val b = Math.sqrt(d * d - a * a)
                val area = a * b
                println("Меньшее основание: $b")
                println("Площадь прямоугольника: $area")
            }
        }
    }
    catch (e: Exception)
    {
        println(e.message)
    }
}