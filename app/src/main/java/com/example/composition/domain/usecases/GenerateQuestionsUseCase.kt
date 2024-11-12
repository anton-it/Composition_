package com.example.composition.domain.usecases

import com.example.composition.domain.entity.Question
import com.example.composition.domain.repository.GameRepository

class GenerateQuestionsUseCase(
    private val repository: GameRepository

) {

    //так как у юскейса только один метод нет смысла давать ему такое же имя как классу
    //поэтому с помощью переопределения operator fun invoke далее мы можем вызвать этот класс как метод

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6  //колличество вариантов ответов
    }
}