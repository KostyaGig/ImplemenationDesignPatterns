package file_app

interface CrudManager {
    fun read() : Document
    fun write(data: Any,path: String) : Boolean

    class Base : CrudManager {
        override fun read(): Document = Document("Document1",500,"This is content for 500 KB")
        override fun write(data: Any, path: String): Boolean {
            var result = false
            if (data is String) {
                result = data.isNotEmpty()
            }
            return result
        }
    }
}