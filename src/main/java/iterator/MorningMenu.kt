package iterator

class MorningMenu(
        private val menuItems: List<MenuItem>
) : Menu<MenuItem> {

    override fun makeIterator(): Iterator<MenuItem>
        = Iterator.MorningIterator(menuItems)
}