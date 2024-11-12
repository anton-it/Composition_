package com.example.composition.domain.entity

data class GameSettings (
    val maxSumValue: Int,  //максимальное значение суммы
    val minCountOfRightAnswers: Int,  //минимальное кол-во правильных ответов для победы
    val minPercentOfRightAnswers: Int, //минимальный процент правильных ответов
    val gameTimeInSeconds: Int //время игры в секундах
)