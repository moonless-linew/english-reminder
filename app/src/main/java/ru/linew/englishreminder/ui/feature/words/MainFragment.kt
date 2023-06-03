package ru.linew.englishreminder.ui.feature.words

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.linew.englishreminder.R
import ru.linew.englishreminder.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding: FragmentMainBinding by viewBinding()
    private val adapter: WordItemsAdapter = WordItemsAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addWord.setOnClickListener {

        }
        binding.wordsList.adapter = adapter
        binding.wordsList.layoutManager = LinearLayoutManager(requireContext())
        adapter.submitList(TestList.data)

    }
}