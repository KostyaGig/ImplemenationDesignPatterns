package decorator

interface Developer {
    fun makeJob() : String

    class JavaDeveloper : Developer {
        override fun makeJob() : String = "Developer write java code"
    }
}

interface Printable {
    fun print()
}