package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("Amanda","andre","caio","julio")

    for (aluno in alunos){
        println(aluno)
    }

    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - ${aluno}")
    }
}