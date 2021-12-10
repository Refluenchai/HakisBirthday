import repository.QuestionRepository.Companion.getQuestions
import util.QuestionMaker
import util.getDayPeriod

fun main() {
    val questions = getQuestions()

    printGreeting()

    for (question in questions) {
        when (questions.indexOf(question)) {
            in 0..3, 6 -> QuestionMaker.isFirstQuestions = true
            4 -> QuestionMaker.isBirthdayQuestion = true
            questions.size -> QuestionMaker.isLastQuestion = true
        }
        QuestionMaker.makeQuestion(question)
    }
}

fun printGreeting() {
    println("Olá, ${getDayPeriod()} :D")
}

