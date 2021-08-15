package mapper_practice

data class Post(
        private val postId: Int,
        private val userId: Int,
        private val title: String,
        private val body: String
) {

    fun <T> map(mapper: PostMapper<T>) : T = mapper.map(postId, userId, title, body)
}