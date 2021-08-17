package iterator

interface Menu<T> {

    fun makeIterator() : Iterator<T>
}