package fundamentos.controles

fun main(args: Array<String>){
    var opcao: Int = -1

    while (opcao != -1) {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Voce escolheu a opcao $opcao")
    }

    println("Ateé a proxima")

}