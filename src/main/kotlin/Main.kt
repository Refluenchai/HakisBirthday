import repository.QuestionRepository.Companion.getQuestions
import util.QuestionMaker
import util.getDayPeriod
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO

var questioncount: Int = 0

fun main() {
    val questions = getQuestions()

    printGreeting()

    try {
        var img = ImageIO.read(File("images\\rewritethestars.png"))
    } catch (e: IOException) {
    }

    for (question in questions) {
        println(questioncount)
        when (questions.indexOf(question)) {
            in 0..3, 6 -> QuestionMaker.isFirstQuestions = true
            4 -> QuestionMaker.isBirthdayQuestion = true
            questions.size -> QuestionMaker.isLastQuestion = true
        }
        QuestionMaker.makeQuestion(question)
        questioncount++
    }
}

fun printGreeting() {
    println("Olá, ${getDayPeriod()} :D")
}

