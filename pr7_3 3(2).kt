fun main()
{
    try
    {
        println("Введите x:")
        val x = readln().toDouble()
        println("Введите K:")
        val K = readln().toInt()
        println("Введите N:")
        val N = readln().toInt()
        val maxKN = if(K > N) K else N
        val minKN = if(K < N) K else N
        val M = if (K == maxKN) maxKN else minKN
        var y = -1.0
        when
        {
            M == maxKN ->
            {
                if (x != 0.0)
                {
                    y = Math.sin(Math.abs(x)) / (x * x)
                }
                else y = -1.0
            }
            M == minKN ->
            {
                y = Math.sin(Math.abs(x)) / (x * x + 1)
            }
            else ->
            {
                y = -1.0
            }
        }
        println("y(x) = $y")
    }
    catch(e: Exception)
    {
        println("Ошибка: ${e.message}")
    }
}