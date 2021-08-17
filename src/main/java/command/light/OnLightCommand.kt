package command.light

import command.Command

class OnLightCommand (
        private val light: Light
) : Command {

    override fun execute() = light.on()

    override fun undo() = light.off()
}