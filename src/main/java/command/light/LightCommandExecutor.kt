package command.light

import command.Command

class LightCommandExecutor(
        private val command: Command
) {

    fun onButtonPressed() = command.execute()

    fun onButtonBackPressed() = command.undo()

}