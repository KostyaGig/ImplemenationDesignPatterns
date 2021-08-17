package proxy

interface File {

    fun content() : String

    class Txt: File {

        override fun content(): String
            = "This is txt file"
    }

    class Image : File {

        override fun content(): String
            = "This is image"
    }
}