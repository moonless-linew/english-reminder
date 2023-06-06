package ru.linew.englishreminder.ui.feature.words

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.linew.englishreminder.databinding.WordItemBinding
import ru.linew.englishreminder.databinding.WordItemContentBinding

class WordItemsAdapter(val itemClickCallback: (View, Word) -> Unit) : ListAdapter<Word, WordItemsAdapter.ViewHolder>(WordItemsCallback()) {
    class ViewHolder(private val binding: WordItemBinding) :
        androidx.recyclerview.widget.RecyclerView.ViewHolder(binding.root){
            fun bind(word: Word, itemClickCallback: (View, Word) -> Unit){
                with(binding){
                    this.word.text = word.word
                    definition.text = word.definition
                    root.transitionName = "word_item_${word}"
                    root.setOnClickListener {
                        itemClickCallback(root, word)
                    }
                }
            }
        }

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
        holder.bind(getItem(position), itemClickCallback)
    }
}
