package ClassesObjetos

class Pessoa1(var nome: String)
class Pessoa2(var nome: String)
class Pessoa3(nomeInicial: String){
    val nome: String = nomeInicial
}


fun main(args: Array<String>){
val p1 = Pessoa1(nome = " Rafaela")
    println("${p1.nome} sabe programar!!")

    val p2 = Pessoa2(nome = "Patricia")
    println("${p2.nome} esta aprendendo a programar!!!")

    val p3 = Pessoa3(nomeInicial = "Sabrina")
    println("${p3.nome} Ja esta programando a tempos!!!")
}