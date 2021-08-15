package item_mapper
//
//abstract class BaseItem(
//        private val id: Int,
//        private val text: String
//) : item_mapper.MyItem {
//
//    override fun <T> map(mapper: item_mapper.Item.item_mapper.MyItemMapper<T>): T
//            = mapper.map(id,text)
//}


interface MyItem {
    fun <T> map(mapper: MyItemMapper<T>): T
}

class Item(
        private val id: Int,
        private val text: String
) : MyItem {
    override fun <T> map(mapper: MyItemMapper<T>): T = mapper.map(id, text)
}







