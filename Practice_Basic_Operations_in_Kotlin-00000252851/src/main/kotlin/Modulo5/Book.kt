package edu.itson.jackMurrieta.Modulo5

class Book(
    val author: String,
    val title: String,
    val year: Int
) {

    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getBookInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}