package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String ="Nilo"
    var cpf: String = "123.456.789-11"
}

fun main(){
    val nilo = Pessoa()
    println(nilo.nome)
    println(nilo.cpf)
}