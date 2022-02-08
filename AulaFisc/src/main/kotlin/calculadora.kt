import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {
    fun somar(num1: Float, num2: Float): Float {
        return num1 + num2
    }

    fun subtrair(num1: Float, num2: Float): Float {
        return num1 - num2
    }

    fun multiplicar(num1: Float, num2: Float): Float {
        return num1 * num2
    }

    fun dividir(dividendo: Float, divisor: Float): Float {
        return dividendo / divisor
    }

    fun potencia(base: Double, expoente: Double): Float {
        return base.pow(expoente).toFloat()
    }

    fun modulo(num1: Float, num2: Float) = { num1 % num2 }

    fun raizQuadrada(num: Float) = sqrt(num)

}

