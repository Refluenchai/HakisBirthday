package model

data class Question(
    val text: Triple<String, String, String>,
    val answers: List<Triple<String, String, Boolean>>
)