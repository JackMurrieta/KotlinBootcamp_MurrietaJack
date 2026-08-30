package edu.itson.jackMurrieta.Moodulo4

open class Book(
    val author: String,
    val title: String,
    private var currentPage: Int = 0
) {

    open fun readPage() {
        currentPage++
    }

    class EBook(
        author: String,
        title: String,
        val format: String = "text"
    ) : Book(author, title) {

        private var wordsRead: Int = 0

        override fun readPage() {
            wordsRead += 250
        }
    }
}