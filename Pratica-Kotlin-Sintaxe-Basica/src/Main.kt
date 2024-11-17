import kotlin.random.Random

fun main() {
    var pontosA = 0
    var pontosB = 0

    println("Iniciando a simulação do set de vôlei...")

    while (true) {
        // Gera o ponto aleatoriamente para a equipe A ou B
        val pontoParaEquipeA = Random.nextBoolean()

        if (pontoParaEquipeA) {
            pontosA++
        } else {
            pontosB++
        }

        // Exibir o placar atual
        println("Placar: A = $pontosA, B = $pontosB")

        // Verificar se há um vencedor
        if ((pontosA >= 25 || pontosB >= 25) && kotlin.math.abs(pontosA - pontosB) >= 2) {
            if (pontosA > pontosB) {
                println("A equipe A venceu o set!")
            } else {
                println("A equipe B venceu o set!")
            }
            break
        }
    }
}
