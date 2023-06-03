package ru.linew.englishreminder.ui.feature.words

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.linew.englishreminder.databinding.WordItemBinding
import ru.linew.englishreminder.databinding.WordItemContentBinding

class WordItemsAdapter : ListAdapter<Word, WordItemsAdapter.ViewHolder>(WordItemsCallback()) {
    class ViewHolder(val binding: WordItemBinding) :
        androidx.recyclerview.widget.RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            WordItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.content.word.text = getItem(position).word
        holder.binding.content.definition.text = getItem(position).definition
    }
}
