/** un carro tiene posicion de columna
 * y fila y tienen una  placa **/

class Carro (
        var columna : Int,
        var fila : Int,
        val IDplaca : String
){
    fun obtenerPlaca(): String{
    return IDplaca
    }

    fun obtenerColumna(): Int{
        return columna
    }

    fun obtenerFila(): Int{
        return fila
    }
    fun placa(): String{
        return IDplaca
    }

    override fun toString(): String {
        return "@"
    }

}