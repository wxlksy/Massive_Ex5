fun main()
{
    println("Введите слова через пробел:")

    val w = readLine()?.split(" ") ?: emptyList()
    val groupW = gWord(w)

    println("Сгруппированные слова:")

    for (group in groupW)
    {
        println(group.joinToString(" "))
    }
}

fun gWord(words: List<String>): List<List<String>>
{
    val wGroup = mutableMapOf<String, MutableList<String>>()

    for (w in words)
    {
        val sortedWord = w.toCharArray().sorted().joinToString("")
        if (!wGroup.containsKey(sortedWord))
        {
            wGroup[sortedWord] = mutableListOf()
        }
        wGroup[sortedWord]?.add(w)
    }

    return wGroup.values.toList()
}