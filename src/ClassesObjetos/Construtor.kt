package ClassesObjetos

fun main(args: Array<String>) {

    val filme = Filme("O Poderoso chefao", 1972, "Drama")
    println(" O filme ${filme.nome} foi lancado em ${filme.anoLancamento} no genero ${filme.genero}")

}

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String) {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}