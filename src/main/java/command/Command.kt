package command

interface Command {

    fun execute()

    fun undo()

    class Empty : Command {
        override fun execute() {
            TODO()
        }

        override fun undo() {
            TODO("Not yet implemented")
        }
    }
}