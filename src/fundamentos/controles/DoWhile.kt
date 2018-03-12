package fundamentos.controles

fun main(args: Array<String>){
    var opcao: Int = 2
    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voce escolheu a opcao $opcao")
    }while (opcao != -1)

        println("Ate a proxima")

}