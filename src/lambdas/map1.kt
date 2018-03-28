package lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf("Brian","Vakinha","Milk")

    alunos.map { it.toUpperCase() }.apply { print(this) }

 }