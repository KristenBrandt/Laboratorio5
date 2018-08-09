class Espacio (
        var estaocupado: Boolean = false,
        var columna: Int,
        var fila: Int,
       // este es string ya que puede ser un numero o letra
        var identificador: String
) {
    fun estadoparque(){
        estaocupado != estaocupado
        identificador = "@"
    }

    override fun toString(): String {
        return identificador
    }
}
