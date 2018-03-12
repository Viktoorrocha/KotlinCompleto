package fundamentos

fun main(args: Array<String>){
    val alunos = arrayListOf("Andre","Carla","Marcia","Gizelly")
    for ((indice, aluno) in alunos.withIndex()){
        println("$indice - $aluno")
    }
}