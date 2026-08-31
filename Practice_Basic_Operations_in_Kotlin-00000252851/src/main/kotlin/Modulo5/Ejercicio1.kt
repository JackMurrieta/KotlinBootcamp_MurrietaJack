package edu.itson.jackMurrieta.Modulo5

fun main() {

    val book = Book(
        "1984",
        "George Orwell",
        1949
    )

    val titleAndAuthor = book.getTitleAndAuthor()

    println(titleAndAuthor.first)
    println(titleAndAuthor.second)

    val bookInfo = book.getBookInfo()

    println(bookInfo.first)
    println(bookInfo.second)
    println(bookInfo.third)
}