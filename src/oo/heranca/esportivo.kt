package oo.heranca

interface Esportivo {
    var turbo: Boolean

    fun ligarTurbo(){
        turbo = true
    }

    fun desligarTurno(){
        turbo = false
    }

}