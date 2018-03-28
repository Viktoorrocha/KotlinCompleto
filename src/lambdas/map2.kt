package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
        Produto("Fichario escolar", 21.90),
        Produto("Lapis de cor", 11.90),
        Produto("Borracha Koreana", 20.10),
        Produto("Estojo", 25.90)
)

fun main(args: Array<String>) {
 val totalizar = {total: Double, atual: Double -> total + atual}

    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)


    println("O preco medio e ${precoTotal / materialEscolar.size}.")
}