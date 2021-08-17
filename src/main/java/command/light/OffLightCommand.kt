package command.light

import command.Command

class OffLightCommand (
        private val light: Light
) : Command {

    override fun execute() = light.off()

    override fun undo() = light.on()
}