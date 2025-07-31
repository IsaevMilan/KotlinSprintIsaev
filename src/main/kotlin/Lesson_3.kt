package org.example

fun main() {

    // Я не совсем понял задание, но надеюсь решение будет правильным :)
    val playerWhite = "mrs.White"
    val playerBlack = "mrs.Black"

    var chessPiece = "пешка"
    var chessMoveNo = 1
    var from = "D2"
    var to = "D3"

    var chessPiesMove = "$playerWhite делает ход №$chessMoveNo $chessPiece с $from на $to"
    println(chessPiesMove)

    chessMoveNo++
    chessPiece = "конь"
    from = "G8"
    to = "F6"

    chessPiesMove = "$playerBlack делает ход №$chessMoveNo $chessPiece с $from на $to"
    println(chessPiesMove)

}