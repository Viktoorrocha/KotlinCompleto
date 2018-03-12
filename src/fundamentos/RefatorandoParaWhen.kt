package fundamentos

fun main(args: Array<String>){
    val nota: Int = 10


    when(nota){
        10, 9 -> println("Fantástico")
        8,7 -> println("Paranbėns")
        6,5,4 -> println("Tem como recuperar")
        in 0..3 -> ("Te vejo no proximo semestre")
        else -> println("Nota invalida")
    }

}