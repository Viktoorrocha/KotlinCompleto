package lambdas

data class paciente (val nome: String, val idade: Int )


fun main(args: Array<String>) {
    val paciente = arrayListOf(
            paciente("Pedro Tavares", 45),
            paciente("Joao Batista", 67),
            paciente("Fernando Prevedelo", 45),
            paciente("Raul Cortez", 76),
            paciente("Paulo Simonetti", 65),
            paciente("Suzana Vieira ", 89),
            paciente("Rosangela Silva", 60),
            paciente("Moacir Franco", 87),
            paciente("Thiago Bartuzo", 71)
    )

    val listaPrioridade = paciente.filter { it.idade>= 40 }.sortedBy { -it.idade }

    println(listaPrioridade)
}