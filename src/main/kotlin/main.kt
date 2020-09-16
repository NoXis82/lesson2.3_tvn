package ru.netology

import java.math.BigDecimal

fun main() {
    val sumPrice = 12000
    val client = true
    println("Покупка на сумму: $sumPrice руб")
    if (sumPrice <= 1000 && sumPrice > 0) {
        val price = if (client) {
            print("Со скидкой 1%: ")
            sumPrice - sumPrice * 0.01
        } else {
            print("Без скидки: ")
            sumPrice
        }
        println("$price руб")
    }
    if (sumPrice > 1000 && sumPrice <= 10000) {
        print("Со скидкой 100 руб: ")
        val price = sumPrice - 100
        println("$price руб")
        if (client) {
            print("Со скидкой 1%: ")
            val priceClient = price - price * 0.01
            println("$priceClient руб")
        }
    } else {
        print("Со скидкой 5%: ")
        val price = sumPrice - sumPrice * 0.05
        println("$price руб")
        if (client) {
            print("Со скидкой 1%: ")
            val priceClient = price - price * 0.01
            println("$priceClient руб")
        }
    }
}