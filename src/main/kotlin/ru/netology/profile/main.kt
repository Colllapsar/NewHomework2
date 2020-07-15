package ru.netology.profile

import ru.netology.profile.model.Profile

fun main() {
    val profile = Profile(name = "Artem", surname = "Kaisin")
    println(profile.fullname)
}