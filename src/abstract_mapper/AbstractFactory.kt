package abstract_mapper

import java.io.IOException
import java.net.UnknownHostException

abstract class AbstractFactory<P,R> {
    abstract fun fetch(param: P) : R

    class ExceptionFactory : AbstractFactory<Exception,IOException>() {
        override fun fetch(param: Exception): IOException = when(param) {
            is UnknownHostException -> NoConnectionError()
            else  -> GenericError()
        }
    }

    class ErrorTypeFactory : AbstractFactory<IOException,ErrorType>() {
        override fun fetch(param: IOException): ErrorType = when(param) {
            is NoConnectionError -> ErrorType.NO_CONNECTION_ERROR
            else -> ErrorType.GENERIC_ERROR
        }
    }

    class ErrorMessageFactory : AbstractFactory<ErrorType,String>() {
        override fun fetch(param: ErrorType): String = when(param) {
                    ErrorType.NO_CONNECTION_ERROR -> "No connection error"
                    else -> "Generic error"
                }
    }
}