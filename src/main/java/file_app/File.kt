package file_app


interface Printable {
    fun print(name: String,size: Int,content: String)

    class Base : Printable {
        override fun print(name: String, size: Int, content: String) = println("Document, name: $name,size: $size,content: $content")
    }
}

class Document(
        private val name: String,
        private val size: Int,
        private val content: String
){
    fun print(printable: Printable) = printable.print(name, size, content)
}

interface File {
    fun readFile() : Document
    fun writeToFile(data: Any): Boolean

    class BaseFile(
            private val path: String,
            private val crudable: Crudable<Any,Document>
    ) : File {
        override fun readFile(): Document = crudable.read()

        override fun writeToFile(data: Any): Boolean = crudable.write(data,path)
    }

}