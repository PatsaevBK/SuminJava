import java.lang.Exception

fun main() {

    val a = homeWork()
    println(a)
}

private fun extracted(string: String): Int {
    var result = ""
    for (char in string) {
        if (char.isDigit()) {
            result += char
        }
    }
    return try {
        result.toInt()
    } catch (e: Exception) {
        -1
    }

}

private fun homeWork(): List<String> {
    val name = arrayListOf<String>("Jogn", "Olivia", "Emma")
    val num = arrayListOf<Int>(2, 1)
    val result = mutableListOf<String>()
    for ((index, value ) in name.withIndex()) {
        if (index < num.size){
            val res = value + " - " + num[index]
            result += res
        }
    }
    return result.toList()
}