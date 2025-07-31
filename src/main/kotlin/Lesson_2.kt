package org.example

fun main() {

    val employeesSalary = 30000 // явные тип пока не указываю
    val countOfEmployees = 50

    val traineeSalary = 20000
    val countOfTrainee = 30

    val totalRegularSalary = employeesSalary * countOfEmployees
    println("Расходы на зарплату постоянных сотрудников: $totalRegularSalary ₽")

    val totalWithTrainees = totalRegularSalary + traineeSalary * countOfTrainee
    println("Общие расходы после устройства стажеров: $totalWithTrainees ₽")

    val averageSalary = totalWithTrainees / (countOfTrainee + countOfEmployees)

    println("Средняя ЗП одного сотрудника: $averageSalary ₽")

}