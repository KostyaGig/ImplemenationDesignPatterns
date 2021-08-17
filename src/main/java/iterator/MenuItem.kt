package iterator


data class MenuItem(
        private val title: String,
        private val description: String
) : Object {

    override fun <T> map(mapper: Mapper<T>): T
        = mapper.map(title, description)
}