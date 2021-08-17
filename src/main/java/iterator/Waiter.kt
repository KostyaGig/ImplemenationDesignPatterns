package iterator

//Оффициант
class Waiter(
        private val menu: Menu<MenuItem>
) {

    fun printMenu() {
        val iterator = menu.makeIterator()
        while(iterator.hasNext()) {
            iterator.next().map(Mapper.Text())
        }
    }
}