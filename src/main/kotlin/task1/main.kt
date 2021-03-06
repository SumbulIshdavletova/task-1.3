package task1

fun main() {

    println("был(а) в сети " + agoToText(18000))
}

fun agoToText(seconds: Int) = when (seconds) {
    in 0..60 -> "только что"
    in 61..3600 -> minutes(seconds) // функция для склонения слов
    in 3600..86400 -> hours(seconds) // функция для склонения слов
    in 86400..172800 -> "сегодня"
    in 172800..345600 -> "вчера"
    else -> "давно"
}

fun minutes(seconds: Int): String {
    val minute = seconds / 60
    val lastDigit = minute % 10
    return when (lastDigit) {
        1 -> "$minute минуту назад"
        2, 3, 4 -> "$minute минуты назад"
        else -> "$minute минут назад"
    }
}

fun hours(seconds: Int): String {
    val hours = seconds / 60 / 60
    val lastDigit = hours % 10
    return when (lastDigit) {
        1 -> "$hours час назад"
        2, 3, 4 -> "$hours часа назад"
        else -> "$hours часов назад"
    }
}


