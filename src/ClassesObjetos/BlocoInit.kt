package ClassesObjetos

class Filme3(nome: String, anoLancamento: Int, genero: String){
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {

    val filme = Filme("Harry Potter", 2002, "ficcao")

    println("O nome do filme e ${filme.nome} foi lancado em ${filme.anoLancamento} e pertence ao genero ${filme.genero}")

}