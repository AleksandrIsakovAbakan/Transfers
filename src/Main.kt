import java.util.*

fun main() {

    timeOfYear()
    println()

    val string = "Шумоизоляция"
    println(string)
    println("Количество повторяющихся символов: ${numberOfRepeatedCharacters(string)}")
}

/*
Написать программу, которая будет включать несколько классов и enum.
Ход работы следующий.
При запуске среда просит ввести месяц года.
После ввода месяца и нажатия на enter, на консоль выводится время года, которому соответствует этот месяц.
После этого программа вновь спросит желаете продолжить или закончить программу:
1. Продолжить;
2. Закончить программу.
Если нажимаем продолжить, то программа вновь просит ввести месяц и цикл повторяется.
*/
fun timeOfYear() {
    while (true) {
        print("Введите месяц года: ")
        val month = readln().uppercase(Locale.getDefault())
        println(Month.valueOf(month).timeOfYear)
        println("Продолжить - 1, Закончить программу - 2")
        val count = readln().toIntOrNull()
        when (count) {
            1 -> continue
            else -> return
        }
    }
}

/*
Дана строка «Шумоизоляция».
Посчитать количество повторяющихся символов.
*/
fun numberOfRepeatedCharacters(string: String): Int {
    val str = string.lowercase(Locale.getDefault()).toCharArray()
    var count = 0
    str.sort()
    if (str.count() < 2) return 0
    var temp = str[0]
    for (a in 1..<str.indices.count()) {
        if (str[a] == temp) {
            println(str[a])
            count++
        }
        temp = str[a]
    }
    return count
}
