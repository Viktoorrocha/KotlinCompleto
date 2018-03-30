package collections

fun main(args: Array<String>) {
    val aprovados = hashSetOf("Joao","Maria","Silvina","Jhon Pedrito","Mussun")

    println("Sem ordem...")

    for (aprovado in aprovados){
        aprovado.print()
    }

    val aprovadosNaOrdem1 = linkedSetOf("Joao","Maria","Silvina","Jhon Pedrito","Mussun")

    println("\nLinked..")
    for (aprovado in aprovadosNaOrdem1) {
        aprovado.print()
    }

    val aprovadosNaOrdem2 = sortedSetOf("Joao","Maria","Silvina","Jhon Pedrito","Mussun")
    println("\nSorted")
    for (aprovado in aprovadosNaOrdem2){
        aprovado.print()
    }

    aprovados.sortedBy { it.substring(1) }.print()
}