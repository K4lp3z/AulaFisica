import Assentos.Assento
import Filmes.Filme

fun main() {

    val cinemaSupinpa = Cinema("CinemaSupinpa", 12, 21)
    println("Bem-Vindo ao CinemaSupinpa!")

    if (
        cinemaSupinpa.addNovoFilme(
            Filme(
                NomeFilme = "#Alive",
                Genero = "Drama, Zombie",
                anoLancamento = 2021,
            )
        )
    )
        if (
            cinemaSupinpa.addNovoFilme(
                Filme(
                    NomeFilme = "Chernobyl: O Filmes.Filmes.Filme",
                    Genero = "Drama & Romance ",
                    anoLancamento = 2021,
                )
            )
        )

        if (
            cinemaSupinpa.addNovoFilme(
                Filme(
                    NomeFilme = "Homem Aranha Sem volta para casa",
                    Genero = "Ação & Drama",
                    anoLancamento = 2021


                )
            )
        )

            println("Filmes.Filmes disponíveis: ")

    val filme = cinemaSupinpa.listaFilmes()
    val quantFilmes = filme.size - 1
    for (index in 0..quantFilmes) {
        println("\nNome: ${filme[index].NomeFilme}\nGeneros: ${filme[index].Genero}\nLançamento: ${filme[index].anoLancamento}")
    }

    ///////////////////////////

    println("\nQual filme você quer assistir?\n1 - Enchanted\n2 - Raya and the last dragon\n3 Homem Aranha Sem volta para casa")
    val escolhaDoUsuario = readLine()!!.toInt()

    if (escolhaDoUsuario == 1){
        cinemaSupinpa.RegistrandoAssento(
            Assento(
                numeroDoAssento = 1,
                AssentosOcupados = "Não"
            )
        )
    } else if (escolhaDoUsuario == 2){
        cinemaSupinpa.RegistrandoAssento(
            Assento(
                numeroDoAssento = 1,
                AssentosOcupados = "Sim"
            )
        )
    } else {
        println("INVALIDO!")
    }

    if (escolhaDoUsuario == 1){
        cinemaSupinpa.RegistrandoAssento(
            Assento(
                numeroDoAssento = 2,
                AssentosOcupados = "Não"
            )
        )
    } else if (escolhaDoUsuario == 2){
        cinemaSupinpa.RegistrandoAssento(
            Assento(
                numeroDoAssento = 2,
                AssentosOcupados = "Sim"
            )
        )
    }

    if (escolhaDoUsuario == 1){
        cinemaSupinpa.RegistrandoAssento(
            Assento(
                numeroDoAssento = 3,
                AssentosOcupados = "Não"
            )
        )
    } else if (escolhaDoUsuario == 2){
        cinemaSupinpa.RegistrandoAssento(
            Assento(
                numeroDoAssento = 3,
                AssentosOcupados = "Sim"
            )
        )

    }

    //////////////////////

    println("Assentos.Assentos disponíveis: ")
    val seat = cinemaSupinpa.listaAssentos()
    val numeroDoAssento = seat.size - 1
    for (index in 0..numeroDoAssento) {
        println("\nAssentos.Assentos: ${seat[index].numeroDoAssento}\nOcupados: ${seat[index].AssentosOcupados}")
    }

    println("Informe seu nome: ")
    val nomeCompleto = readLine()!!.toString()

    println("\nEscolha alguma das opções: ${nomeCompleto}?\nNumero 1 para o primeiro assento\nNumero 2 para o segundo assento \nNumero 3 para o terceiro assento")

    val ocupado = readLine()!!.toInt()

    if(escolhaDoUsuario == 1 && ocupado == 3){
        println("Este assento está ocupado")
    } else if (escolhaDoUsuario == 2 && ocupado == 2 ||
        escolhaDoUsuario == 2 && ocupado == 3){
        println("Este assento está ocupado")
    }

    val precoIngresso = 32
    val metade = 2
    val tax = 4.48

    println("\nComo você se identifica\n1 - Estudante\n2 - Professor\n3 - Idoso\n4 - NDA")
    val totalValue = when (readLine()!!.toInt()){
        1 -> println("Valor final: ${(precoIngresso % metade) + tax}")
        2 -> println("Valor final: ${(precoIngresso % metade)+ tax}")
        3 -> println("Valor final: ${(precoIngresso % metade)+ tax}")
        else -> println("Valor final é: 36,48")
    }

    println("${nomeCompleto}, Deseja finalizar a compra de um ingresso no preço de: ${totalValue}\n1 - Sim!\n2 - Não!")
    val end = readLine()!!.toInt()

    if (end == 1){
        println("Tenha um bom filme!!!")
    } else if(end == 2){
        println("Até a proxima!")
    }

}
