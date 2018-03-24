package ClassesObjetos

class Cliente {

    var nome: String = " "

}

fun main(args: Array<String>){
    val cliente = Cliente()
    cliente.nome = "Thais"
    println("O cliente e ${cliente.nome}")
}