package command

import command.light.Light
import command.light.LightCommandExecutor
import command.light.OnLightCommand

fun main() {

    val light = Light()
    val onLightCommand = OnLightCommand(light)
    val executor = LightCommandExecutor(onLightCommand)
    executor.onButtonPressed()
    executor.onButtonBackPressed()
}