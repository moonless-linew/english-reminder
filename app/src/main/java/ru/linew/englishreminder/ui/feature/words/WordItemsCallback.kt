package ru.linew.englishreminder.ui.feature.words

import androidx.recyclerview.widget.DiffUtil

class WordItemsCallback: DiffUtil.ItemCallback<Word>(){
    override fun areItemsTheSame(oldItem: Word, newItem: Word): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Word, newItem: Word): Boolean {
        return oldItem == newItem
    }
}