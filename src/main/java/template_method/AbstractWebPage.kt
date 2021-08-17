package template_method

abstract class AbstractWebPage {

    final fun showPage() {
        println("Header")
        contentPage()
        println("Footer")
    }

    abstract fun contentPage()
}