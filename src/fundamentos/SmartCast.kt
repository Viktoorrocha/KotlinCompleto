package fundamentos

fun main(args: Array<String>){

    souEsperto("Ola")

    souEsperto(9)

    souEsperto2("Opa")

    souEsperto2(7)

}

fun souEsperto(x: Any){
    if (x is String){
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}



fun souEsperto2(x: Any){
    when(x){
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repense sua vida")
    }
}