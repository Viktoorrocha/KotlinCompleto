package fundamentos.controles

fun main(args: Array<String>){
    val num1: Int = 2
    val num2: Int = 3


    val maiorValor = if (num1 > num2){
        println("Processando if...")
        num1
    }
    else {
        println("processando else...")
        num2
    }
    println("O maior valor e : $maiorValor")
}