package mapper_practice

/**
 * Check test [PostMapperTest]
 */
interface PostMapper<T> {

    fun map(postId: Int,userId: Int,title: String,body: String) : T

    class Id(private val postId: Int) : PostMapper<Boolean> {
        override fun map(postId: Int, userId: Int, title: String, body: String): Boolean
            = this.postId == postId
    }

    class CollapsePost : PostMapper<Post> {
        override fun map(postId: Int, userId: Int, title: String, body: String): Post
            = Post(postId + 1,userId, title, body)
    }
}