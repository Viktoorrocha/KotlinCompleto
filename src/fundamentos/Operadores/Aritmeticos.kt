package fundamentos.Operadores

fun main(args: Array<String>){
    val (v1, v2, v3, v4) = listOf(3, 5, 8, 112)


    val soma = v1 + v2 + v3 + v4
    val subtracao = v4 - v2
    val divisao = v3 / v4
    val multiplicacao = v1 * v2
    val modulo = v1 % v2

    println("$soma $subtracao $divisao $multiplicacao $modulo")
}