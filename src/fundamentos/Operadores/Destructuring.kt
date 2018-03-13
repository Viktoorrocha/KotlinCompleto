package fundamentos.Operadores

data class Carro(val marca: String, val modelo: String)

fun main (args: Array<String>){

    val(marca, modelo) = Carro("Ford", "Fusion")
    println("$marca $modelo")

    val (marido, mulher) = listOf("Joao","Maria")
    println(" $marido, $mulher")

    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar")


}
