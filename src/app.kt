import java.lang.Integer.parseInt

/**
 * función principal, punto de entrada de la aplicación
 */
fun main() {

    var miComputadora = Computer(" i5", Mouse())
    println(miComputadora.cpu)
    println("${miComputadora.cpu} tiene un raton ${miComputadora.mouse.tipo}")
    println(miComputadora.toString())

    var ratonSorpresa=Mouse("ay")
    println(ratonSorpresa.tipo)
    miComputadora.memoria=2500
    println(miComputadora.toString())
}
