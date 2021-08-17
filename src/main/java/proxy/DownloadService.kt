package proxy

interface DownloadService<T> {

    fun download() : T

    class BaseFile(
            private val fileUrl: String
    ) : DownloadService<File> {

        override fun download() : File {
            println("Download file by $fileUrl")
            return File.Txt()
        }
    }

    class ProxyFile(
            private val fileUrl: String
    ) : DownloadService<File> {

        init {
            println("Initialize file url $fileUrl")
        }

        override fun download(): File
            = DownloadService.BaseFile(fileUrl).download()
    }
}