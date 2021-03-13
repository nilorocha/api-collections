package main.kotlin.one.digitalinnovation.collections

fun main(){

    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1500.0, tipoContratacao = "CLT")
    val jose = Funcionario(nome = "Jose", salario = 4000.0, tipoContratacao = "PF")


    val funciorios = mutableListOf(joao, maria)
    funciorios.forEach { println(it) }


    println("===========================")
    funciorios.add(jose)
    funciorios.forEach { println(it) }

    println("===========================")
    funciorios.remove(joao)
    funciorios.forEach { println(it) }

    println("===========================")
    val funcionarioSet = mutableSetOf(joao)
    // funcionarioSet.forEach{ println(it)}

    funcionarioSet.add(jose)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }
    println("===========================")

    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}