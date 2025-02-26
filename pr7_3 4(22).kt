fun main()
{
    try
    {
        println("Введите a:")
        val a = readln().toDouble()
        println("Введите b:")
        val b = readln().toDouble()
        println("Введите c:")
        val c = readln().toDouble()
        when
        {
            a == 0.0 && b == 0.0 ->
            {
                if (c == 0.0)
                {
                    println("Уравнение имеет бесонечно много решений (0 = 0)")
                }
                else
                {
                    println("Уравнение не имеет решений (неверное равенство)")
                }
            }
            a == 0.0 ->
            {
                val x = -c / b
                println("Уравнение линейное. Корень: x = $x")
            }
            else ->
            {
                val discriminant = b * b - 4 * a * c
                when
                {
                    discriminant > 0 ->
                    {
                        val sqrtD = Math.sqrt(discriminant)
                        val x1 = (-b + sqrtD) / (2 * a)
                        val x2 = (-b - sqrtD) / (2 * a)
                        println("Уравнение имеет два корня: x1 = $x1, x2 = $x2")
                    }
                    discriminant == 0.0 ->
                    {
                        val x = -b / (2 * a)
                        println("Уравнение имеет один корень: x = $x")
                    }
                    else ->
                    {
                        println("Уравнение не имеет действительных корней (дискриминант < 0)")
                    }
                }
            }
        }
    }
    catch (e: Exception)
    {
        println("Ошибка: ${e.message}")
    }
}