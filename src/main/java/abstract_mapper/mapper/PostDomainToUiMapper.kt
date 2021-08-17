package abstract_mapper.mapper

import PostUi
import abstract_mapper.AbstractFactory
import abstract_mapper.ErrorType
import java.io.IOException

interface PostDomainToUiMapper : Abstract.Mapper {
    fun map(title: String, body: String, e: IOException) : PostUi

    class Base(
            private val factory: AbstractFactory<IOException,ErrorType>,
            private val uiFactory: AbstractFactory<ErrorType,String>
    ) : PostDomainToUiMapper {
        override fun map(title: String, body: String, e: IOException): PostUi
            = PostUi(title,factory.fetch(e),uiFactory)
    }
}