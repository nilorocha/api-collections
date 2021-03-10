package main.kotlin.one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1500.0, tipoContratacao = "CLT")
    val jose = Funcionario(nome = "Jose", salario = 4000.0, tipoContratacao = "PF")

    val funcionarios = listOf(joao,jose, maria)

    funcionarios.forEach { println(it) }
    println("==========================")
    println(funcionarios.find { it.nome == "Maria" })

    println("===========Listby===============")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("=============Groupby=============")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String

) {
    override fun toString(): String =
        """
        Nome:       $nome
        Salario:    $salario
        
        """.trimIndent()
    }











