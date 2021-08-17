package command.light

import command.AbstractTechnic


class Light : AbstractTechnic {

    override fun on() = println("On light")

    override fun off() = println("Off light")
}
