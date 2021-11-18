package repository

import model.Question
import util.oneSecond
import util.threeSeconds
import util.twoSeconds

class QuestionRepository private constructor() {
    companion object {
        fun getQuestions(): MutableList<Question> {
            return mutableListOf(
                Question(
                    text = Triple(
                        "Você é a Haki?",
                        "\n--> Sim(1)" +
                                "\n--> Não(2)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple("1", "Hm, isso ainda foi muito simples\n", true),
                        Triple("2", "Hm, isso não é pra você, sai daqui!!!\n", false),
                    )
                ),
                Question(
                    text = Triple(
                        "Quando você nasceu?",
                        "\n--> 10 de dezembro de 2001(1)" +
                                "\n--> 15 de agosto de 2003(2)" +
                                "\n--> 08 de junho de 1997(3)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple("1", "Nada mal, nada mal...\n", true),
                        Triple("2", "Data errada impostoror(a), sai daqui!!!\n", false),
                        Triple("3", "Data errada impostoror(a), sai daqui!!!\n", false),
                    )
                ),
                Question(
                    text = Triple(
                        "Qual o seu sobrenome favorito?",
                        "\n--> Sofia(1)" +
                                "\n--> Oliveira(2)" +
                                "\n--> Santos(3)" +
                                "\n--> Brasil(4)" +
                                "\n--> Ferreira(5)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple("1", "Não sabe o sobrenome né..., impostor(a), sai daqui!!!\n", false),
                        Triple("2", "Não sabe o sobrenome né..., impostor(a), sai daqui!!!\n", false),
                        Triple("3", "Não sabe o sobrenome né..., impostor(a), sai daqui!!!\n", false),
                        Triple("4", "Só mais uma coisa...\n", true),
                        Triple("5", "Não sabe o sobrenome né..., impostor(a), sai daqui!!!\n", false),
                    )
                ),
                Question(
                    text = Triple(
                        "Quem é o amor da sua vida?",
                        "\n--> Victor(1)" +
                                "\n--> Gabriel(2)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple("1", "Ah oi Haki, que bom que está aqui :3\n", true),
                        Triple(
                            "2", "Se foi a Haki, isso foi maldade, mas ainda assim, sai fora daqui!!!",
                            false
                        ),
                    )
                ),
                Question(
                    text = Triple(
                        "Primeira coisa, hoje é seu aniversário?",
                        "\n--> Sim(1)" +
                                "\n--> Não(2)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "Que óteemo, então vamos seguindo\n",
                            true
                        ),
                        Triple(
                            "2",
                            "Desculpa Haki mas isso é só para o seu aniversário ;(, então...,\n" +
                                    "sai fora daqui, rummmm!!!\n",
                            false
                        ),
                    )
                ),
                Question(
                    text = Triple(
                        "Segunda coisa, como você está?",
                        "\n--> Incrível(1)" +
                                "\n--> Bem(2)" +
                                "\n--> Normal(3)" +
                                "\n--> Mal(4)" +
                                "\n--> Horrível(5)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "Eita, tá no ponto essa goxtosa ein\n\n" +
                                    "Bom, isso aqui sera uma historinha interativa, onde cada uma das ocasiões\n" +
                                    "especiais vão te deixar escolher pra que lado ir, porem, só existe um caminho certo,\n" +
                                    "escolher errado podera te levar por caminhos horriveis, por isso escolha com sabedoria.\n",
                            true
                        ),
                        Triple(
                            "2",
                            "Boa, gosto de ver você assim\n\n" +
                                    "Bom, isso aqui sera uma historinha interativa, onde cada uma das ocasiões\n" +
                                    "especiais vão te deixar escolher pra que lado ir, porem, só existe um caminho certo,\n" +
                                    "escolher errado podera te levar por caminhos horriveis, por isso escolha com sabedoria.\n",
                            true
                        ),
                        Triple(
                            "3",
                            "Vish, vou te animar agora :D\n\n" +
                                    "Bom, isso aqui sera uma historinha interativa, onde cada uma das ocasiões\n" +
                                    "especiais vão te deixar escolher pra que lado ir, porem, só existe um caminho certo,\n" +
                                    "escolher errado podera te levar por caminhos horriveis, por isso escolha com sabedoria.\n",
                            true
                        ),
                        Triple(
                            "4",
                            "Que chato, mas vai dar tudo certo bebezinha :)\n\n" +
                                    "Bom, isso aqui sera uma historinha interativa, onde cada uma das ocasiões\n" +
                                    "especiais vão te deixar escolher pra que lado ir, porem, só existe um caminho certo,\n" +
                                    "escolher errado podera te levar por caminhos horriveis, por isso escolha com sabedoria.\n",
                            true
                        ),
                        Triple(
                            "5",
                            "O meu deus, o que que fizeram com a minha menina, espero que isso ajude ;(\n\n" +
                                    "Bom, isso aqui sera uma historinha interativa, onde cada uma das ocasiões\n" +
                                    "especiais vão te deixar escolher pra que lado ir, porem, só existe um caminho certo,\n" +
                                    "escolher errado podera te levar por caminhos horriveis, por isso escolha com sabedoria.\n",
                            true
                        )
                    )
                ),
                Question(
                    text = Triple(
                        "Vamos lá?",
                        "\n--> Sim(1)" +
                                "\n--> Não(2)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "Óteemo, vamos começar\n" +
                                    "Imagine um mundo muito parecido com o nosso, onde você é um jovem pinguim\n" +
                                    "antropomorfico que esta apenas cursando matematica e pensando sobre a vida.\n" +
                                    "Nesse momento você se encontra na praça de alimentação, um pouco antes da sua\n" +
                                    "aula começar, quando recebe uma mensagem de oi de um estranho.\n",
                            true
                        ),
                        Triple(
                            "2",
                            "Ah que pena, quem sabe na próxima então...\n",
                            false
                        ),
                    )
                ),
                Question(
                    text = Triple(
                        "O que você faz?",
                        "\n-->Só ignora e sobe pra sala de aula(1)" +
                                "\n-->Diz oi também(2)" +
                                "\n-->Joga o celular no chão e vai embora pra casa(3)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "Ignorando a mensagem, você tem uma vida normal, termina a faculdade,\n" +
                                    "arruma um emprego e  morre sozinho.\n",
                            false
                        ),
                        Triple(
                            "2",
                            "Você diz oi ao estranho e descobre que é uma pinguim femea que mora em\n" +
                                    "um lugar super desconhecido com ancestrais ladrões.\n" +
                                    "A pinguim só queria conversar, e conhecer alguém novo\n",
                            true
                        ),
                        Triple(
                            "3",
                            "Jogando o celular no chão e indo pra casa, seus pais acabam não gostando\n" +
                                    "nada da sua rebeldia e te mandam embora de casa, você vive hj na rua com um\n" +
                                    "ratinho chamado Larry.\n",
                            false
                        ),
                    )
                ),
                Question(
                    text = Triple(
                        "O que você faz?",
                        "\n-->Continua a falar com ela(1)" +
                                "\n-->Sobe pra sala e diz que fala com ela depois(2)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "Continuando falando com ela você perde a aula, acumula matéria e a chateia\n" +
                                    "fazendo com que ela nunca mais queira falar com você.\n",
                            false
                        ),
                        Triple(
                            "2",
                            "   Você diz a ela que depois poderão falar, porque agora tera de subir para\n" +
                                    "a sala. A aula passa(mais alguma materia de calculo onde sua cabeça fica\n" +
                                    "queimando de tanto usa-la). e apos isso você volta pra casa e dorme.\n\n" +
                                    "   No outro dia você verifica seu celular e vê que pinguim já mandou mensagem,\n" +
                                    "vocês conversam bastante enquanto você vai para o seu estagio de matematica.\n\n" +
                                    "   Há muito em comum entre os dois, conversam sobre os varios problemas da vida\n" +
                                    "e sobre as coisas legais tambem e isso te deixa bem feliz.\n\n" +
                                    "   Agora você chegou no trabalho\n",
                            true
                        )
                    )
                ),
                Question(
                    text = Triple(
                        "O que você faz?",
                        "\n-->Fala pra ela pra continuarem a conversa depois(1)" +
                                "\n-->Fala com ela de vez em quando durante o dia(2)" +
                                "\n-->Fala com ela o dia todo e não trabalha(3)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "   Fazer isso, faz com que você fique muito tempo sem falar com ela,\n" +
                                    "o que a faz perder logo o interesse em você, já que vocês não desenvolveram\n" +
                                    "tanta conexão até esse ponto.\n",
                            false
                        ),
                        Triple(
                            "2",
                            "   Durante o dia, você responde mensagens dela de vez em quando,\n" +
                                    "ainda assim seus colegas ficam te olhando mal, porque você deveria\n" +
                                    "estar fazendo calculos. Vocês falam muito, se dão muito bem juntos.\n\n" +
                                    "   Porém, as coisas não poderiam ser tão boas, derrepente, surge uma nuvem\n" +
                                    "negra que tras maldade para o mundo(Oh nãaaao), com isso, você e a pinguim\n" +
                                    "que tinham fraquezas contra essa nuvem, acabam ficando sem muita força vital\n" +
                                    "e você sofre o dobro de dano por não saber lidar com a nuvem dos dois.\n",
                            true
                        ),
                        Triple(
                            "3",
                            "   Isso se torna um habito, e fazendo isso todos os dias, logo você é demitido,\n" +
                                    "o que faz os seus pais e a pinguim não gostarem de você, assim como todos os\n" +
                                    "seus amigos, por conta de você ser uma vergonha pra espercie. Sentindo todo esse\n" +
                                    "despreso de todos a sua volta, você toma muita coca-cola e morre.",
                            false
                        )
                    )
                ),
                Question(
                    text = Triple(
                        "O que você faz?",
                        "\n-->Deixa de falar com a pinguim(1)" +
                                "\n-->Esperam juntos a nuvem passar(2)" +
                                "\n-->Apenas sucumbe a nuvem(3)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "   Deixando de falar com a pinguim a nuvem ainda persiste, porém com o tempo\n" +
                                    "ela vai se descipando, principalmente após você deixar seu estagio de matematica\n" +
                                    "pra focar em derrotar a nuvem, mas a que preço...\n\n" +
                                    "   Um tempo se passa e agora você já derrotou a nuvem, terminou o seu curso\n" +
                                    "de matematica e hoje faz várias coisas e procura sempre estar em movimento\n" +
                                    "para a nuvem não te pegar de novo, mas acaba que algumas coisas não estão no\n" +
                                    "lugar, você se sente sozinho, e ainda sente falta daquela pinguim, além de se\n" +
                                    "sentir um inutil as vezes, por não ter nenhuma função na vida.\n\n" +
                                    "   Mas eis que derrepende como antes você recebe uma mensagem da tal pinguim,\n" +
                                    "falando pra você se cuidar, por conta de um monstro que estava caçando\n" +
                                    "todos os animais.\n",
                            true
                        ),
                        Triple(
                            "2",
                            "   Esperando juntos a nuvem passar, acaba por deixar ela maior, nenhum dos dois\n" +
                                    "aprende sozinho a lidar melhor com a nuvem, o que os deixa fracos e no fim os\n" +
                                    "dois morrem juntos(Que romantico <3)",
                            false
                        ),
                        Triple(
                            "3",
                            "   Você sucumbe a nuvem e ao enves de ficar triste, se torna o pinguim mas\n" +
                                    "babaca que tem, tendo como simbolo a anarquia e não se da bem com ninguém.",
                            false
                        )
                    )
                ),
                Question(
                    text = Triple(
                        "O que você faz?",
                        "\n-->Volta a falar com ela(1)" +
                                "\n-->Deixar isso de lado(2)" +
                                "\n-->Se jogar em um abismo(3)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "   Voltando a falar com ela, você descobre tudo o que ela fez nesse meio tempo,\n" +
                                    "e que ela amadureceu muito lutando com a nuvem, na verdade, hoje ela é uma\n" +
                                    "guerreira que deseja ajudar a todos os animais que não conseguem prosseguir,\n" +
                                    "dando auxilio e recuperando as habilidades deles.\n\n" +
                                    "   Com isso, aos poucos vocês vão retomando a intimidade que tinham e falam\n" +
                                    "todos os dias e todos os problemas que você tinha, vão se extinguindo com o tempo.\n" +
                                    "Mas isso é estranho, com o tempo passando, você acaba sentindo algo diferente,\n" +
                                    "como se ela fosse diferente, não consegue mais ve-la como amiga(mesmo fazendo\n" +
                                    "tantas coisas de amigos) e no fim você acaba ficando tão encantado pela dança\n" +
                                    "dessa jovem pinguim, que tem a certeza de que isso é amor.\n",
                            true
                        ),
                        Triple(
                            "2",
                            "   Você somente ignora ela, fazendo com que que você se sinta mal por\n" +
                                    "isso e fazendo a vida continuar ruim como antes, porem agora com mais\n" +
                                    "uma dose extra de culpa",
                            false
                        ),
                        Triple(
                            "3",
                            "   Você desiste de tudo se entrega a nuvem e nunca mais é visto por ninguém,\n" +
                                    "na verdade nem sequer vão lembrar que você um dia existiu",
                            false
                        )
                    )
                ),
                Question(
                    text = Triple(
                        "O que você faz?",
                        "\n-->Conta tudo para ela(1)" +
                                "\n-->Espera um tempo(2)" +
                                "\n-->Se jogar em um abismo(3)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "   Contar tudo pra ela te deixa muito mais corajoso, tão corajoso\n" +
                                    "que acaba por testar seus limites em varias areas da vida que requerem\n" +
                                    "coragem como escalada e todo tipo de coisa  que pode te matar, fazendo\n" +
                                    "com que agora ela não goste mais de você, por que ela gosta de guaxinins\n" +
                                    "nerds.\n",
                            false
                        ),
                        Triple(
                            "2",
                            "   Esperando você acaba por junto dela, criar definições diferentes para\n" +
                                    "os proprios sentimentos, uma forma de tentar expressar esse amor sem\n" +
                                    "que a outra pessoa saiba(ja que se ela não sentisse o mesmo, não valeria\n" +
                                    "a pena falar).\n\n" +
                                    "   Mas um dia, conversando, ela acaba declarando, dizendo que ama você e\n" +
                                    "que sempre gostou de você, desde o dia que vocês se conheceram. Eis que\n" +
                                    "a pressão desce mais que tudo.\n",
                            true
                        )
                    )
                ),
                Question(
                    text = Triple(
                        "O que você faz?",
                        "\n-->Agora você conta pra ela(1)" +
                                "\n-->Diz que só quer amizade(2)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "   Você conta pra ela tudo oque sente e desde quando isso começou e os dois\n" +
                                    "decidem ficar juntos, decidem planos sobre a vida a dois, casamento,\n" +
                                    "filhos, falam tudo um para o outro e sempre estão lá pra se ajudar em\n" +
                                    "tudo.São momentos maravilhosos os que você passa com ela, claro que o\n" +
                                    "mundo as vezes tenta estragar, mais não sei se ele seria forte o suficiente\n" +
                                    "pra fazer isso.\n\n" +
                                    "   Bom, passado algum tempo você arruma um emprego de matematico junior,\n" +
                                    "já que passou muito tempo estudando(o que te faz não se sentir mais mal\n" +
                                    "por não fazer nada), e é claro que ela esteve ao seu lado durante todo\n" +
                                    "o processo.\n\n" +
                                    "   E hoje é o aniversario dela, essa pinguim maravilhosa.\n",
                            true
                        ),
                        Triple(
                            "2",
                            "   Fazendo isso vocês continuam com a faixada de antes e acabam por encontrar\n" +
                                    "parceiros diferentes e nunca mais se vendo(que escolha horrivel ein brother).",
                            false
                        )
                    )
                ),
                Question(
                    text = Triple(
                        "O que você faz?",
                        "\n-->Um mini joguinho de escolhas contando a história de vocês(1)" +
                                "\n-->Um desenho pra representar vocês dois(2)" +
                                "\n-->Um video bonitinho com fotos dela(3)" +
                                "\n-->Compra uma skin de casal pra ela(4)" +
                                "\n-->Todas as opções(5)",
                        "\nResposta: "
                    ),
                    answers = listOf(
                        Triple(
                            "1",
                            "Opção errada!",
                            false
                        ),
                        Triple(
                            "2",
                            "Opção errada!",
                            false
                        ),
                        Triple(
                            "3",
                            "Opção errada!",
                            false
                        ),
                        Triple(
                            "4",
                            "Opção errada!",
                            false
                        ),
                        Triple(
                            "5",
                            "Opção correta!\n" +
                                    "Eu te amo minha princesa :3",
                            true
                        ),
                    )
                )
            )
        }
    }
}