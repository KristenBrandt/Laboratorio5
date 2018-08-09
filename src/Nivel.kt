
class Nivel(
        val identificador: String,
        val color: String,
        val lugar : String,
        val name: String

) {
    //val columna: Int
    //val fila: Int
    var walls: ArrayList<Wall> = ArrayList()
    var espacios: ArrayList<Espacio> = ArrayList()
     var carros: ArrayList<Carro> = ArrayList()

    fun agregarPared(wall: Wall) {
        walls.add(wall)
    }
    fun agregarCarro(carro: Carro){
        carros.add(carro)
    }
    fun encontrarPlaca(carro: Carro): Carro?{
        return this.carros.firstOrNull{it.obtenerPlaca() == it.placa()}
    }
    //fun espacios(espacio: Espacio){
     //   return espacio
    //}

    fun puedeParkear (item: String): Boolean{
        return if (item.toIntOrNull() != null){
            val  itemC = item.toInt()
            itemC in 0..9
        } else {
            item in "A".."Z" || item in "a".."z"
        }
    }
}

        /**fun agregarEspacio(espacio: Espacio) {
            //TODO VER SI ESPACIO ES VALIDO
            espacios.add(espacio)
        }

        fun agregarCarro(carro: Carro) {
            carros.add(carro)
        }

        // TODO fun getNivel()**/



