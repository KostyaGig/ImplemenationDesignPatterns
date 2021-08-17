package template_method

fun main() {
    val newsPage: AbstractWebPage = NewsPage()
    val mainPage: AbstractWebPage = MainPage()

    val pages = listOf(newsPage, mainPage)
    
    pages.forEach {page->
        page.showPage()
    }

}