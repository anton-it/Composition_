package com.example.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable


@Parcelize
data class GameResult (
    val winner: Boolean, //победил\нет
    val countOfRightAnswers: Int, //кол-во правильных ответов
    val countOfQuestions: Int, //Общее кол-во вопросов на которое ответил игрок
    val gameSettings: GameSettings
): Parcelable