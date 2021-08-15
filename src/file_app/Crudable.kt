package file_app

interface Crudable<in T,out R> {

    fun read(): R
    fun write(data: T,path: String): Boolean

    class Base(
            private val crudManager: CrudManager
    ): Crudable<Any,Document> {
        override fun read(): Document = crudManager.read()

        override fun write(data: Any,path: String): Boolean = crudManager.write(data,path)
    }

}