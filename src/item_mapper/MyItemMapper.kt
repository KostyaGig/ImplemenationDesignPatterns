package item_mapper

interface MyItemMapper<T> {
    fun map(id:Int, text:String) : T

    class CompareId (
            private val id: Int
    ) : MyItemMapper<Boolean> {

        override fun map(id: Int, text: String): Boolean
                = this.id == id
    }

    class CompareItem(
            private val item: Item
    ) : MyItemMapper<Boolean> {

        override fun map(id: Int, text: String): Boolean
                = item.map(CompareId(id))
    }

    class TestCompareItem(
            private val item: Item
    ) : MyItemMapper<Boolean> {

        override fun map(id: Int, text: String): Boolean
            = item.map(CompareId(id))
    }

}

