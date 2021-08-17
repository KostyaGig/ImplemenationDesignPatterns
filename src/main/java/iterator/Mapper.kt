package iterator

interface Object {

    fun <T> map(mapper: Mapper<T>) : T
}

interface Mapper<T> {

    fun map(title: String, description: String) : T

    class Text : Mapper<Unit> {
        override fun map(title: String, description: String)
            = println("Menu item title: $title, description: $description")
    }
}