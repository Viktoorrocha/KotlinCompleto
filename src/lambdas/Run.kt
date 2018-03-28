package lambdas

fun main(args: Array<String>) {
    var casa = Casa()

    casa.run {
        endereco = "Rua ABC"
        num = 134
    }

    println(casa)
}



data class Casa(var endereco: String = "", var num: Int = 0 )