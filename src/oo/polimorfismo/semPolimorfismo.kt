package oo.polimorfismo

class Feijao(val peso: Double)
class Arroz(val peso: Double)

class Pessoa(var peso: Double) {
    fun comer(feijao: Feijao){
        peso += feijao.peso
    }


    fun comer(arroz: Arroz){
        peso +=  arroz.peso
    }

}

fun main(args: Array<String>) {
    val feijao = Feijao(0.4)
    val arroz = Arroz(60.6)

    val joao = Pessoa(108.9)
    joao.comer(feijao)
    joao.comer(arroz)

    println(joao.peso)
}