package ClassesObjetos

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>) {
    val filme = Filme2("Monstos S.A", 2001, "Comedia")

    println("O filme ${filme.nome} foi lancado em ${filme.anoLancamento} do genero ${filme.genero}")
}