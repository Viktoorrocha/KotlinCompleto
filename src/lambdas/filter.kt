package lambdas

data class Aluno (val nome:String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
            Aluno("Brian", 9.8),
            Aluno("Vakinha", 7.8),
            Aluno("Magrinho", 8.8),
            Aluno("Xepa", 8.8),
            Aluno("Milk",9.1)
        )

    val aprovados = alunos.filter { it.nota >= 7.0}.sortedBy { it.nome }


    println(aprovados)
}