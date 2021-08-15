import abstract_mapper.AbstractFactory
import abstract_mapper.ErrorType
import abstract_mapper.mapper.PostCloudToDomainMapper
import abstract_mapper.mapper.PostDomainToUiMapper
import java.io.IOException


abstract class Abstract {

    interface Object<T,M: Mapper> {
        fun map(mapper: M) : T
    }
    interface Mapper

    interface DataMapper : Mapper {
        fun map(title: String, errorMessage: String)
    }
    interface Unit : Object<kotlin.Unit,DataMapper>
}

data class PostCloud(
        private val id: Int,
        private val title: String,
        private val body: String,
        private val e: Exception
) : Abstract.Object<PostDomain, PostCloudToDomainMapper> {
    override fun map(mapper: PostCloudToDomainMapper): PostDomain = mapper.map(title,body, e)
}

data class PostDomain(
        private val title: String,
        private val body: String,
        private val e: IOException
) : Abstract.Object<PostUi, PostDomainToUiMapper> {
    override fun map(mapper: PostDomainToUiMapper): PostUi = mapper.map(title,body,e)
}

data class PostUi(
        private val title: String,
        private val errorType: ErrorType,
        private val factory: AbstractFactory<ErrorType,String>
) : Abstract.Unit {
    override fun map(mapper: Abstract.DataMapper) {
        mapper.map(title, factory.fetch(errorType))
    }
}


