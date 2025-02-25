fun main()
{
    println("Введите высоту падения (в метрах):")
    val h = readln().toDouble()
    try
    {
        val time = when
        {
            h < 0.0 -> "Высота не может быть отрицательной"
            h == 0.0 -> 0.0
            else ->
            {
                val g = 9.8
                Math.sqrt(2 * h / g)
            }
        }
        println("Время падения: $time секунд")
    }
    catch (e: Exception)
    {
        println("Ошибка: ${e.message}")
    }
}