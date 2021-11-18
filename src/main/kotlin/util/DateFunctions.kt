package util

import java.util.*

fun getDayPeriod(): String {
    return when(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)) {
        in 0..11 -> "bom dia"
        in 12..18 -> "boa tarde"
        else -> "boa noite"
    }
}

fun isHakisBirthday(): Boolean {
    val currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    val currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1

    return currentDay == 10 && currentMonth == 12
}