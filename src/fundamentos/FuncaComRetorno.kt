package fundamentos


fun main (args: Array<String>){
    println(Soma(2,3))
    println(Soma(11))
}

fun Soma(a: Int , b: Int = 1): Int{

    return a + b
}