package oo.polimorfismo

open class Comida(val peso: Double)

class Feijao2(peso: Double) : Comida(peso)
class Arroz2( peso: Double) : Comida(peso)
class Ovo(peso: Double) : Comida(peso)

class Pessoa2(var peso: Double) {
    fun comer(feijao: Feijao2){
        peso += feijao.peso
    }


    fun comer(arroz: Arroz2){
        peso +=  arroz.peso
    }

}

fun main(args: Array<String>) {
    val feijao = Feijao2(0.4)
    val arroz = Arroz2(60.6)
    val ovo = Ovo(0.2)

    val joao = Pessoa(108.9)


    println(joao.peso)
}