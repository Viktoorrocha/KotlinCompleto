package collections

data class Fruta (var nome : String, var preco : Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(
            Fruta("Banana",1.40),

            Fruta("Morango",5.40))

    for (fruta in frutas){
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    println(frutas.contains(Fruta("Goiaba",3.60)))
}