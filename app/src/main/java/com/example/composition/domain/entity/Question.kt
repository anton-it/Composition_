package com.example.composition.domain.entity

data class Question (
    val sum: Int, //сумма в кружке
    val visibleNumber: Int, //видимое число в левом квадрате
    val options: List<Int> //варианты ответов
)