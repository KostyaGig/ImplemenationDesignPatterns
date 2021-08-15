package factory_method

fun main() {
    //todo check test for FurnitureFactory
}

abstract class Furniture {
    abstract fun type() : String

    //Стул
    class Chair: Furniture() {
        override fun type(): String = "Chair"
    }

    class Table : Furniture() {
        override fun type(): String = "Table"
    }
}

abstract class FurnitureFactory() {

    abstract fun create() : Furniture

    class Chair : FurnitureFactory() {

        override fun create(): Furniture = Furniture.Chair()
    }

    class Table : FurnitureFactory() {

        override fun create(): Furniture = Furniture.Table()
    }
}