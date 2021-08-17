package decorator

abstract class DeveloperDecorator(
        private val developer: Developer
) : Developer, Printable {
    override fun makeJob(): String = developer.makeJob()

    class SeniorJavaDeveloper(developer: Developer) : DeveloperDecorator(developer) {
        private val job = super.makeJob() + "and make code review (Senior)"

        override fun makeJob(): String = super.makeJob() + "and make code review (Senior)"
        override fun print() = println(job)
    }

    class MiddleJavaDeveloper(developer: Developer) : DeveloperDecorator(developer) {
        private val job = super.makeJob() + "helpers any junior"

        override fun print() = println(job)
    }
}