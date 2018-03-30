package collections

fun main(args: Array<String>) {
    val map = hashMapOf(1 to "Gui", 2 to "Rebecca", 3 to "Cibalena")


    for ((id, nome)in map){
        println("$id) $nome")
    }
}