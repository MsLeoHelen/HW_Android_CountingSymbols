package com.example.hw_android_countingsymbols

fun addEndOfWord(number: Int): String {
    val num = if(number < 0) number * -1
    else number

    return when {
        (num % 10 == 0) || (num % 100 in 9..19) -> "ов"
        (num % 100 in 22..29) || (num % 10 in 2..4) -> "а"
        num % 10 in 5..8 -> "ов"
        else -> ""
    }
}