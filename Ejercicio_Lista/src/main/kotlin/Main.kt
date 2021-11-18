fun main(args: Array<String>) {
    var Lista = MutableList(10){
            (5..9).random()
    }
    Lista.forEach(){
        var i=0
        println("En la posicion $i hay un $it")
    }
    fun Busqueda ( cont:Int , valor: Int ){
        if (cont > 0){
            if (valor == 5){
                println("5 en la Posicion $cont ")
            }
            Busqueda(cont - 1 , Lista[cont -1])
        }
        else {
            if (cont == 0){
                println("Fin")
            }
        }
    }
    var contador = 9
    var valor= Lista[contador]
    Busqueda(contador, valor)
}
