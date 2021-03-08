package main.kotlin.one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2400.0, 4000.6)

    for (salario in salarios){
        println(salario)
    }
    println("-------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    val salariosMaiorQ2500 = salarios.filter{it > 2500.0}

    println("-------------------")
    salariosMaiorQ2500.forEach { println(it) }

    println("-------------------")
    println(salarios.count{it in 2000.0..5000.0})

    println("-------------------")

    println(salarios.find { it == 2400.0 })
    println(salarios.find { it == 400.0 })


    println("-------------------")
    println(salarios.any{it == 1000.0 })
    println(salarios.any{it == 1500.0 })

}




















