package ru.linew.englishreminder.ui.feature.words

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.transition.platform.MaterialContainerTransform
import ru.linew.englishreminder.R
import ru.linew.englishreminder.databinding.FragmentMainBinding
import ru.linew.englishreminder.databinding.FragmentWordInfoBinding
class WordInfoFragment: Fragment(R.layout.fragment_word_info) {
    private val binding: FragmentWordInfoBinding by viewBinding()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = MaterialContainerTransform().apply {
            drawingViewId = R.id.activity_main
            scrimColor = Color.TRANSPARENT
        }
    }
}