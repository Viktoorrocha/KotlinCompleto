package fundamentos.Operadores

fun main(args: Array<String>){
    val executoutrabalho1: Boolean = true
    val executoutrabalho2: Boolean = true



    val comprouSorvete: Boolean = executoutrabalho1 || executoutrabalho2
    val comprouTv50: Boolean = executoutrabalho1 && executoutrabalho2


    println(comprouSorvete)
    println(comprouTv50)

}