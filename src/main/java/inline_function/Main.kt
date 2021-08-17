package inline_function

fun main() {
    val list = listOf(1)
    list.forEach {  }
}

inline fun foo(lambda: () -> Unit) {

}

fun test() : Int {
    foo {
        return 0
    }
    return 1
}

interface MyMapper<T> {
    fun <T> map(data: String): T
}