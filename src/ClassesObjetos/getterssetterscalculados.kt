package ClassesObjetos

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean){
        val inativo: Boolean get() = !ativo
        val precoComDesconto: Double get() = preco * ( 1 - desconto)
    }

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2345.90, 0.20, ativo = true)

    val p2 = Produto("Galaxy Note 7", 2645.90, 0.30, ativo = false)
}