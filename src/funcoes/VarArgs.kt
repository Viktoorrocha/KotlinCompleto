package funcoes

fun main(args: Array<String>){

    for (n in ordenar(38, 45, 45, 67,  78, 87, 2, 21, 34))
    print("$n ")

}


fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

