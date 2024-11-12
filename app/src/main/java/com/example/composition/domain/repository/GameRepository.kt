package com.example.composition.domain.repository

import com.example.composition.domain.entity.GameSettings
import com.example.composition.domain.entity.Level
import com.example.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int, //макс значение которое нужно сгенерировать в поле сумаа
        countOfOptions: Int //сколько генерировать правильных ответов
    ): Question

    fun getGameSettings(level: Level): GameSettings
}