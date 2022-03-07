fun main(args: Array<String>) {
    //NOME DA FUNÇÃO PARA RODAR O SISTEMA

}

fun Triangulo(): Unit {
    // Calculos estão na class TrianguloCalc \\
    println("Entre com a medida do lado 1 do triangulo: ")
    val lado1 = readLine()!!.toInt()

    println("Entre com a medida do lado 2 do triangulo: ")
    val lado2 = readLine()!!.toInt()

    println("Entre com a medida do lado 3 do triangulo: ")
    val lado3 = readLine()!!.toInt()

    val resultado = TrianguloCalc(lado1, lado2, lado3)
    println(resultado.verificarCalculo())

}

fun anoBissexto(): Unit {
    print("Digite um ano:")
    val ano = readLine()!!.toInt()

    if ((ano % 100 != 0) && (ano % 4 == 0) || (ano % 400 == 0))
        println("$ano é um ano bissexto!")
    else
        println("$ano não é um ano bissexto!")
}

fun Csi(): Unit {

    println("Telefonou para a vítima? \n1-Sim ou 0-Não ")
    val pergunta1 = readLine()!!.toInt()

    println("Esteve no local do crime? \n1-Sim ou 0-Não ")
    val pergunta2 = readLine()!!.toInt()

    println("Mora perto da vítima? \n1-Sim ou 0-Não ")
    val pergunta3 = readLine()!!.toInt()

    println("Devia para a vítima? \n1-Sim ou 0-Não ")
    val pergunta4 = readLine()!!.toInt()

    println("Já trabalhou com a vítima? \n1-Sim ou 0-Não ")
    val pergunta5 = readLine()!!.toInt()

    var somaPerguntas = pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5

    if (somaPerguntas < 2) {
        println("\nInocente")

    }else if (somaPerguntas == 2) {
        println("\nSuspeito")

    }else if (somaPerguntas <= 4 || somaPerguntas <= 3) {
        println("\nCúmplice")

    }else if (somaPerguntas == 5) {
        println("\nAssassino")

    }
}

fun Combustivel() {

    var precoA = 3
    var precoG = 5

    var valorFinalA: Float
    var valorFinalG: Float

    println("Digite qual combustível você comprou: \n1 - Álcool \n2 - Gasolina")
    when (readLine()!!.toInt()) {

        1 -> println("Opção escolhida: Álcool")
        2 -> println("Opção escolhida: Gasolina")

        else -> println("Opção Invalida!")
    }

    println("Quantos litros: ")
    var quantLitros: Int = readLine()!!.toInt()

    //Alcool
    if (quantLitros <= 20) {
        valorFinalA = (precoA * (quantLitros * (1 - (3 / 100)))).toFloat()
        println("Você Adicionou em seu veiculo $quantLitros Litros")
        println("Valor final a pagar pelo Alcool é de: $valorFinalA")

    } else if (quantLitros >= 21) {
        valorFinalA = (precoA * (quantLitros * (1 - (5 / 100)))).toFloat()
        println("Você Adicionou em seu veiculo $quantLitros Litros")
        println("Valor final a pagar pelo Alcool é de: $valorFinalA")

    //Gasolina
    }else if  (quantLitros <= 20) {
        valorFinalG = (precoG * (quantLitros * (1-(4 / 100)))).toFloat()
        println("Valor final a pagar pela Gasolina: $valorFinalG")

    }else if (quantLitros > 21) {
        valorFinalG = (precoG * (quantLitros * (1-(6 / 100)))).toFloat()
        println("Valor final a pagar pela Gasolina: $valorFinalG")
    }
}


