fun main(args:Array<String>){
    val calculadora: Calculadora = Calculadora()

    val resultadoSoma: Float = calculadora.somar(23f,78f)
    println("O resultado da soma e $resultadoSoma")

    val raiz = calculadora.raizQuadrada(81f)
    print("A raiz quadrada de 81 e $raiz")

    val geometria: geometria = geometria()

    println("Calculadora a area do circulo:")
    println("Digite o raio:")
    var raio = readLine()!!.toDouble()
    var area = geometria.calcularAreaDoCirculo(raio)

    print("A area do circulo e: $area")
}