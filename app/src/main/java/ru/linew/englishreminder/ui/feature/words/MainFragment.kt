package ru.linew.englishreminder.ui.feature.words

import android.os.Bundle
import android.view.View
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.transition.MaterialElevationScale
import ru.linew.englishreminder.R
import ru.linew.englishreminder.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {
    private val itemClickCallback: (View, Word) -> Unit = { view: View, word: Word ->
        val extras = FragmentNavigatorExtras(view to "word_info")
        findNavController().navigate(R.id.action_FirstFragment_to_wordInfoFragment, null, null, extras)
    }
    private val binding: FragmentMainBinding by viewBinding()
    private val adapter: WordItemsAdapter = WordItemsAdapter(itemClickCallback)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.wordsList.adapter = adapter
        adapter.submitList(TestList.data)

    }

}