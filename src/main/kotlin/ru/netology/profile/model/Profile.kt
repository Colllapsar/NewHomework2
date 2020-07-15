package ru.netology.profile.model

data class Profile(
    val id :Int = 1,
    val login :String = "colllapsar",
    val name :String,
    val surname :String,
    val status :String = "god",
    val avatar :String = "-_-"
){
    val fullname :String = "$name $surname"
}