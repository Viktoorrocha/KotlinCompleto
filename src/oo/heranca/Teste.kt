package oo.heranca

fun main(args: Array<String>) {
    val carro = Ferrari()
    carro.acelarar()
    println(carro)

    carro.ligarTurbo()
    println(carro)


    carro.frear()
    carro.frear()
    println(carro)
}