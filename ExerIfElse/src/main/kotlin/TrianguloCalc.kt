class TrianguloCalc (

    private var lado1: Int,
    private var lado2: Int,
    private var lado3: Int

){
    fun verificarCalculo() {

        if (lado1 + lado2 < lado3 || lado1 + lado2 < lado3 || lado2 + lado3 < lado1) {
            println("Nao é um triangulo!")

        }else if ((lado1 == lado2) and (lado1 == lado3)){
            println("É um Equilatero!")

        } else if ((lado1 == lado2) or (lado1 == lado3) or (lado2 == lado3)){
            println("É um Isósceles!")

        } else
            println("É um Escaleno!")
    }
}