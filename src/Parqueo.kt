import java.io.File
import java.io.IOException
import java.io.InputStream


class Parqueo(

    val niveles : ArrayList<Nivel> = ArrayList()
) {

    /**fun getNivi(): ArrayList<Nivel> {
        return Nivel(identificador,color ,lugar, name)
    }**/

    fun agregarNivel(nivel: Nivel): Boolean {
        //if (!hayNivel(nivel)) {
            niveles.add(nivel)
            return true
        }
        //return false
    }
    //fun hayNivel(nivel: Nivel): Boolean{
     //   return niveles
    //    }


    fun crearNivel(lugar: String, name: String, color: String, idetificador: String): Nivel {
        val lineList: ArrayList<String> = ArrayList()
        try {
            val inputStream: InputStream = File("/Users/kristen/Desktop/Laboratorio5/$lugar.txt").inputStream()
            inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it)} }

        } catch (e: IOException) {
            println("El nombre del archivo no era correcto, no se encontro un archivo con ese nombre.")
        }
    val NewMapLevel = Nivel(lugar, name, color, idetificador)
    var i: Int = 0
    for (linea: String in lineList) {
        for (columna: String in lineList)
            linea.forEach {
                var j: Int = 0
                val character = lineList[i][j]
                when (character) {
                    // TODO Convertir String a Char
                   /** " " -> {
                    }
                    "*" -> {
                        val newWall = Wall(i,j)
                        NewMapLevel.agregarPared(newWall)
                    }
                    else -> {
                        val item = character
                        NewMapLevel.puedeParkear(item)
                    }
                }**/


            }
    }
}
        return NewMapLevel
}





  /**  fun hayNivel(nivel: Nivel):{
        return niveles.any {
            it -> it.identificador
        }
    }
}/** **/