package main.kotlin.one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)
    map1.forEach{ (k, v) -> println("Chaves: $k - Valor: $v")}

    val map2 = mapOf(
        "Pedro" to  2500.0,
        "mMaria" to 3000.5
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")  }




}