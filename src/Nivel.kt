class Nivel(
        val nivel: String,
        val identificador: Int,
        val color: String,
        val columna : Int,
        val fila : Int,
        val archivowhere : String,
        var walls : ArrayList<Wall> = ArrayList(),
        var espacios : ArrayList<Espacio> = ArrayList(),
        var carros: ArrayList<Carro> = ArrayList()

) {
    fun agregarPared (wall: Wall){
        walls.add(wall)
    }

    fun agregarEspacio (espacio: Espacio){
        espacios.add(espacio)
    }

    fun agregarCarro (carro: Carro){
        carros.add(carro)
    }




}
