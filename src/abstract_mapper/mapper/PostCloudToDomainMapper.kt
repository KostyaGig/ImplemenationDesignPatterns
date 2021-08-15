package abstract_mapper.mapper

import PostDomain
import abstract_mapper.AbstractFactory
import java.io.IOException

interface PostCloudToDomainMapper : Abstract.Mapper {
    fun map(title: String, body: String, e: Exception) : PostDomain

    class Base(
            private val factory: AbstractFactory<Exception,IOException>
    ) : PostCloudToDomainMapper {
        override fun map(title: String, body: String, e: Exception): PostDomain = PostDomain(title,body,factory.fetch(e))
    }
}