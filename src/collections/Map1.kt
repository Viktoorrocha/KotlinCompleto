package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(10020030040, "Joao")
    map.put(10030040090,"Maria")
    map.put(10050040065,"Lucia")


    for (par in map){
        println(par)
    }
    for (nome in map.values){
        println(nome)
    }

    for (cpf in map.keys){
        println(cpf)
    }
}