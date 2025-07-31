package org.example

fun main() {

    val trainingDay = 5
    val isAbsAndHands = trainingDay % 2 == 1

    println(
        """
        Упражнения для рук:    $isAbsAndHands
        Упражнения для ног:    ${!isAbsAndHands}
        Упражнения для спины:  ${!isAbsAndHands}
        Упражнения для пресса: $isAbsAndHands
        """.trimMargin()
    )

}





