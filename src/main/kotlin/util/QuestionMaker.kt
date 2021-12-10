package util

import model.Question
import wallpaper.WallpaperChanger
import kotlin.system.exitProcess

object QuestionMaker {

    var isFirstQuestions: Boolean = false
    var isBirthdayQuestion: Boolean = false
    var isLastQuestion: Boolean = false
    private lateinit var question: Question

    fun makeQuestion(question: Question) {
        this.question = question

        printQuestion(question.text)
        loopAnswers(getCurrentAnswer(), question.answers)
        finish()
    }

    private fun printQuestion(questionText: Triple<String, String, String>) {
        print(
            ANSI_PURPLE + questionText.first + ANSI_RESET +
                    ANSI_BLUE + questionText.second + ANSI_RESET +
                    ANSI_GREEN + questionText.third + ANSI_RESET
        )
    }

    private fun loopAnswers(
        currentAnswer: String,
        answers: List<Triple<String, String, Boolean>>
    ) {
        for (answer in answers) if (hasAnswerChecked(
                currentAnswer,
                answer
            )
        ) break
    }

    private fun hasAnswerChecked(
        currentAnswer: String,
        answer: Triple<String, String, Boolean>
    ): Boolean {
        val isOneOfTheAnswers: Boolean
        if (isCurrentAnswer(currentAnswer, answer.first)) {
            isOneOfTheAnswers = true
            if (isTheRightAnswer(answer.third)) printRightAnswer(answer.second)
            else printWrongAnswer(answer.second)
        } else return false
        checkUnscheduledAnswer(isOneOfTheAnswers)
        return true
    }

    private fun isCurrentAnswer(
        currentAnswer: String,
        answerKey: String
    ): Boolean {
        return currentAnswer == answerKey
    }

    private fun getCurrentAnswer(): String {
        return readLine().toString().uppercase()
    }

    private fun isTheRightAnswer(rightAnswer: Boolean): Boolean {
        return rightAnswer
    }

    private fun printRightAnswer(answerText: String) {
        if (isBirthdayQuestion && !isHakisBirthday()) {
            println(birthdayLiar)
            exitProcess(0)
        } else if (isLastQuestion) {
            printAnswer(answerText)
            WallpaperChanger().rodar()
            exitProcess(0)
        }
        printAnswer(answerText)
    }

    private fun printWrongAnswer(answerText: String) {
        if (isFirstQuestions) {
            printAnswer(answerText)
            exitProcess(0)
        } else {
            printAnswer(answerText)
            printAnswer(ANSI_YELLOW + wrongAnswer + ANSI_RESET)
            makeQuestion(question)
        }
    }

    private fun printAnswer(answer: String) {
        println(answer)
    }

    private fun checkUnscheduledAnswer(isOneOfTheAnswers: Boolean) {
        if (!isOneOfTheAnswers) {
            printAnswer(ANSI_RED + unscheduledAnswer + ANSI_RESET)
            makeQuestion(question)
        }
    }

    private fun finish() {
        isFirstQuestions = false
        isBirthdayQuestion = false
        isLastQuestion = false
    }
}



