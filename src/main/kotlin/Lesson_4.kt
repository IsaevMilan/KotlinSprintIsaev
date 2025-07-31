package org.example

fun main() {

    val weatherToday = "sunny"
    val isTentOpen = true
    val humidityPercent = 20
    val isWinter = true

    val isFavorableConditions: Boolean = weatherToday == "sunny" &&
            isTentOpen &&
            humidityPercent == 20 &&
            !isWinter

    println(if (isFavorableConditions) "Условия благоприятные" else "Условия не благоприятные")


}




