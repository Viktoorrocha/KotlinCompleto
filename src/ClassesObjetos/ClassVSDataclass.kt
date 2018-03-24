package ClassesObjetos

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)


fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2)


    val tv1 = Televisao("samsung", 46)
    val tv2 = Televisao("samsung", 46)

    println(tv1 == tv2)

}