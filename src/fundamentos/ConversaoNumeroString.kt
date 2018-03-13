package fundamentos

fun main(args: Array<String>){
    val a: Int = 1

    //numero para string
    println(a.toString() + 1)

    //String para numero
    println("1.9".toDouble() + 3)
    println("teste".toIntOrNull() ?: 0)
    println("teste".toInt() + 3)

}