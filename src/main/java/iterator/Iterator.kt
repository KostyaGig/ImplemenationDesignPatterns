package iterator

interface Iterator<T> {

    fun hasNext() : Boolean

    fun next() : T

    class MorningIterator(
            private val menuItems: List<MenuItem>
    ) : Iterator<MenuItem> {

        private var position = 0

        override fun hasNext(): Boolean = position < menuItems.size


            override fun next(): MenuItem {
                val menuItem = menuItems[position]
                position++
                return menuItem
            }
        }


    class DinnerIterator(
            private val menuItems: Array<MenuItem>
    ) : Iterator<MenuItem> {
        private var position = 0

        override fun hasNext(): Boolean = position < menuItems.size

        override fun next(): MenuItem {
            val menuItem = menuItems[position]
            position++
            return menuItem
        }
    }
}


