package decorator

    fun main() {
        DeveloperDecorator.MiddleJavaDeveloper(
                DeveloperDecorator.SeniorJavaDeveloper(
                        Developer.JavaDeveloper()
                )
        ).print()
    }