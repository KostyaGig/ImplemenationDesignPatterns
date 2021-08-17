package mapper_practice

import org.junit.Assert.*
import org.junit.Test

class PostMapperTest {

    @Test
    fun test_comapre_id_mapper() {
        val post = Post(1,1,"Main post","This is post contains many useful information")
        val postCompareIdMapper = PostMapper.Id(1)
        val expected = post.map(postCompareIdMapper)
        assertTrue(expected)
    }

    @Test
    fun test_collapse_post_mapper() {
        val post = Post(123,321,"Collapse post","Content for collapse post")
        val collapsePostMapper = PostMapper.CollapsePost()
        val expected = Post(124,321,"Collapse post", "Content for collapse post")
        val actual = post.map(collapsePostMapper)
        assertEquals(expected, actual)
    }
}