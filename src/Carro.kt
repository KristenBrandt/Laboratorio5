/** un carro tiene posicion de columna
 * y fila y tienen una  placa **/

class Carro (
        var columna : Int,
        var fila : Int,
        val IDplaca : String
){
    override fun toString(): String {
        return "@"
    }
}