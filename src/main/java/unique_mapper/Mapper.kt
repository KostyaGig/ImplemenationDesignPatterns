package unique_mapper

interface Mapper<R> {
    fun map(title: String, body: String) : R

    class ToDomainPost : Mapper<DomainPost> {
        override fun map(title: String, body: String): DomainPost = DomainPost(title,body)
    }

    class ToUiPost : Mapper<UiPost> {
        override fun map(title: String, body: String): UiPost = UiPost(title)
    }
}

data class DataPost(
        private val id: Int,
        private val title: String,
        private val body: String
) {
    fun <T> map(mapper: Mapper<T>) : T = mapper.map(title,body)
}

data class DomainPost(
        private val title: String,
        private val body: String
) {
    fun <T> map(mapper: Mapper<T>) : T = mapper.map(title,body)
}

data class UiPost(
        private val title: String
) {
    fun map(mapper: DataMapper) = mapper.map(title)
}
