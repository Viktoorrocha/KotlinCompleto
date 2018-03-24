package ClassesObjetos

class ItemDePedido(val nome: String, var preco: Double){
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        @JvmStatic var desconto: Double = 0.0

    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }

}


fun main(args: Array<String>) {
    val item1 = ItemDePedido("TV 50 Polegadas", 3400.00)

}