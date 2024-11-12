package com.example.composition.domain.entity

data class GameResult (
    val winner: Boolean, //победил\нет
    val countOfRightAnswers: Int, //кол-во правильных ответов
    val countOfQuestions: Int, //Общее кол-во вопросов на которое ответил игрок
    val gameSettings: GameSettings
)