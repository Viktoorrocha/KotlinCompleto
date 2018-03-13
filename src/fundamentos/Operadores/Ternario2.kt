package fundamentos.Operadores

fun main(args: Array<String>){

    println(obterResultado(8.5))

}


fun obterResultado(nota : Double) : String = if (nota >= 7.0) "Passou" else "Reprovou"