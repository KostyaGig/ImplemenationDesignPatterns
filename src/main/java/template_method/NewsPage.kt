package template_method

class NewsPage : AbstractWebPage() {

    override fun contentPage() = println("News page content...")
}