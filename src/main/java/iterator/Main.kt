package iterator

fun main() {

    val arrayMenuItem = arrayOf(
            MenuItem("Pizza","This is pizza... ARRAY"),
            MenuItem("Coca-Cola","This is coca-cola ARRAY")
    )

    val listMenuItem = listOf(
            MenuItem("Pizza","This is pizza... LIST"),
            MenuItem("Coca-Cola","This is coca-cola LIST")
    )

    val dinnerMenu = DinnerMenu(arrayMenuItem)
    val morningMenu = MorningMenu(listMenuItem)
    val dinnerWaiter = Waiter(dinnerMenu)
    val morningWaiter = Waiter(morningMenu)
    dinnerWaiter.printMenu()
    morningWaiter.printMenu()

}