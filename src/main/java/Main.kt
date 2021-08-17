import abstract_mapper.AbstractFactory
import abstract_mapper.mapper.PostCloudToDomainMapper
import abstract_mapper.mapper.PostDomainToUiMapper
import unique_mapper.*
import java.io.IOException
import java.net.UnknownHostException

fun main() {
    //TEST ABSTRACT MAPPER (package: abstract_mapper)
    val postCloud = PostCloud(1,"postCLoud1","PostCLoud1Body",IOException())
    val exceptionFactory = AbstractFactory.ExceptionFactory()
    val postDomain = postCloud.map(PostCloudToDomainMapper.Base(exceptionFactory))
    val errorTypeFactory = AbstractFactory.ErrorTypeFactory()
    val errorMessageFactory = AbstractFactory.ErrorMessageFactory()
    val postUi = postDomain.map(PostDomainToUiMapper.Base(errorTypeFactory,errorMessageFactory))
    postUi.map(object : Abstract.DataMapper {
        override fun map(title: String, errorMessage: String) {
            println("DataMapper, data title: $title,errorMessage: $errorMessage")
        }
    })

    //TEST UNIQUE MAPPER (package: unique_mapper)
    val dataPost = DataPost(1,"title1","body1")
    val domainPost = dataPost.map(Mapper.ToDomainPost())
    val uiPost = dataPost.map(Mapper.ToUiPost())

    println(domainPost is DomainPost && uiPost is UiPost)
    uiPost.map(object : DataMapper {
        override fun map(title: String) {
            println(title)
        }
    })

}
