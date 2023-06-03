package ru.linew.englishreminder.ui.feature.words

data class Word(
    val word: String,
    val definition: String? = null,
    val translation: Translation? = null
)