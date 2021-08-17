package proxy

fun main() {

    val downloadService = DownloadService.ProxyFile("https::google.com/txt/cars/192739")
    val file = downloadService.download()
    println("Content file ${file.content()}")
}