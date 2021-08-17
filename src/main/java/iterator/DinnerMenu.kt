package iterator

//обеденное
class DinnerMenu(
        private val menuItems: Array<MenuItem>
) : Menu<MenuItem> {
    override fun makeIterator(): Iterator<MenuItem>
        = Iterator.DinnerIterator(menuItems)
}