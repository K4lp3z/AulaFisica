import kotlin.math.PI
import kotlin.math.pow

class geometria {
    fun calcularAreaDoCirculo(raio: Double): Double = PI * (raio.pow(2)).toFloat()

    fun calcularAreaDoTriangulo(base: Byte, Altura: Byte): Int = base * Altura / 2

    fun calcularPerimetroDoCirculo(raio: Double): Float = (2 * PI * raio).toFloat()

}