fun pagamento () : Unit {

    println("Informe o valor do produto: ")
    val valorVenda = readLine()!!.toFloat()

    ////////////////////

    println("Escolha alguma opção: \n1 - À vista\n2 - À prazo\n3 - À prazo parcelado")

    when (readLine()!!.toDouble()) {
        1.0 -> println("Opção escolhida: À vista \nValor Total: ${valorVenda - (valorVenda * 15 / 100)}" )

        2.0 -> println("Opção escolhida: À prazo (30 dias) \nValor Total: ${valorVenda + (valorVenda * 3 / 100)}")

        3.0 -> println("Opção escolhida: À prazo parcelado \nValor Total: ${valorVenda + (valorVenda * 1.5 / 100)}")

        else -> println("Opção Invalida!")}
}
