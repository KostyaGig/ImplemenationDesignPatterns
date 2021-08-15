package builder

data class User(
        private val name: String,
        private val secondName: String,
        private val age: Int,
        private val salary: String,
        private val musics: List<String>,
        private val movies: List<String>,
) {

    fun printUser() = println("User was build name $name, secondName $secondName, age $age, salary $salary, musics length ${musics.size}, movies length ${movies.size}")

    class Builder() {

        private var name: String = ""
        private var secondName: String = ""
        private var age: Int = -1
        private var salary: String = ""
        private var musics: List<String> = emptyList()
        private var movies: List<String> = emptyList()

        fun name(name: String) : Builder = apply { this.name = name }
        fun secondName(secondName: String) : Builder = apply { this.secondName = secondName }
        fun age(age: Int) : Builder = apply { this.age = age }
        fun salary(salary: String) : Builder = apply { this.salary = salary }
        fun musics(musics: List<String>) : Builder = apply { this.musics = musics }
        fun movies(movies: List<String>) : Builder = apply { this.movies = movies }


        fun build() : User = User(
                name, secondName, age, salary, musics, movies
        )
    }
}

fun main() {
    val user = User.Builder()
            .musics(listOf("LTE","OH WHO"))
            .build()
    user.printUser()
}

