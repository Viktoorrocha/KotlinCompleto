package fundamentos.controles

fun main(args: Array<String>){
    val nota: Double = 5.6

    //usando operador range
    if (nota in 9..10){
        println("Fantastico")
    }
    else if (nota in 7..8){
        println("Parabéns")
    }
    else if (nota in 4..6 ){
        println("Tem como recuperar")
    }
    else if ( nota in 0..3){
        println("Te vejo no proximo semestre")
    }
    else {
        println("Nota Invalida!!!")
    }
}