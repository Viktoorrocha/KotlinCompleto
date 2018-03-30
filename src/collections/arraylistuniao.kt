package collections

fun main(args: Array<String>) {
    val numeros = arrayListOf(1,2,3,4,5)
    val strings = arrayListOf("leticia", "clara", "Ju", "steffany")


    val uniao = numeros + strings //sobrecarga de operadores

    for (item in uniao){
        println(item)
    }
}