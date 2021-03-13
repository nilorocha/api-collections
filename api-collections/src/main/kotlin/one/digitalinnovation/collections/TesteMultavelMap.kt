package main.kotlin.one.digitalinnovation.collections


fun main(){
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1500.0, tipoContratacao = "CLT")
    val jose = Funcionario(nome = "Jose", salario = 4000.0, tipoContratacao = "PF")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(jose.nome, jose)
    repositorio.create(maria.nome, maria)

    println(repositorio.findByid(maria.nome))

    println("==========================")
    repositorio.findAll().forEach { println(it) }



    println("============Exclui==============")

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}