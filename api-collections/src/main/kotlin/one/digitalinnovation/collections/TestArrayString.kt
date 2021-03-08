package one.digitalinnovation.collections
import kotlin.Array

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"
    for(nomes in nomes){
        println(nomes)
    }

    println("--------------------------")
    nomes.sort()
    nomes.forEach { println(it) }


    println("--------------------------")

    val nomes2 = arrayOf("Monica", "Ana" , "Julio", "Renata")
    nomes2.sort()
    nomes2.forEach { println(it) }
}