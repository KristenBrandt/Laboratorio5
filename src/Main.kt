import java.io.File
import java.io.InputStream

/** Kristen Brandt 171482 **/
fun Menu1 (start: Boolean, admin : Boolean, cliente: Boolean): String{
    if (start){
        return """
            Menu:
                1. Administrador
                2. Conductor
                3. Salir
        """.trimIndent()
    }
    if (admin){
        return """
            Menu:
                1. Crear nivel
                2. Eliminar nivel
                3. Ver todos los niveles
                4. Salir
        """.trimIndent()
    }
    if(cliente) {
        return """
        Menu:
            1. Ingresar placa
            2. Salir
        """.trimIndent()
    }
    return "Hay un error"
}
fun main (args:Array<String>) {
    var admin = false
    var start = true
    var cliente = false
    val Parqueo: Parqueo = Parqueo()
    var keepProgram = true
    do {
        println(Menu1(start, admin, cliente))
        println("Ingrese una opcion del menu:")
        val queHacer = readLine()
        if (start){
            when(queHacer){
                "1" -> {
                    start = false
                    admin = true
            }
                "2"-> {
                    start = false
                    admin = false
                    cliente = true
                }
                "3" -> {
                    keepProgram = false

            }
            }
        } else if (admin){
            when (queHacer){
                "1" -> {
                    println("Ingrese el nombre del nivel:")
                    val name = readLine()
                    println("Ingrese el identificador del nivel:")
                    val identificador = readLine()
                    println("Ingrese el color del nivel:")
                    val color = readLine()
                    println("Ingrese el lugar donde esta el archivo:")
                    val lugar = readLine()
                    // TODO crear el nuevo nivel o ver si ya esta creado
                   // val newMapNivel = Parqueo.crearNivel(identificador,name,color,lugar)
                    //Parqueo.agregarNivel()

                }
                "2" -> {
                    println("Ingrese el identificador del nivel que quere eliminar: ")
                    val eliminate = readLine()
                    //TODO BORRAR NIVEL
                }
                "3" -> {
                    println("Los niveles que estan presentes son:")

                }
                "4" -> {
                    keepProgram = false
                }
            }
        }else if (cliente){
            when (queHacer){
                "1"  -> {
                    println("Ingrese la placa de su vehiculo")
                    val placa = readLine()
                    // TODO ver si placa ya fue ingresada
                     }
                "2" -> {
                    keepProgram = false
                }
            }
        }
    }
    while (keepProgram)

}