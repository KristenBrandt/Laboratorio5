class Espacio (
        var estaocupado: Boolean = false,
        val columna: Int,
        val fila: Int,
        val id: String
       // este es string ya que puede ser un numero o letra
) {
    fun estadoparque(){
        estaocupado != estaocupado
    }

    fun obtenerColumna(): Int{
        return columna
    }

    fun obtenerFila(): Int{
        return fila
    }
    fun getIdenti(): String{
        return id
    }

    override fun toString(): String {
        return id
    }
}
