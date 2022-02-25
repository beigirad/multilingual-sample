package ir.beigirad.multilingual.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.beigirad.multilingual.R
import ir.beigirad.multilingual.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentSlideshowBinding.inflate(inflater, container, false).apply {
        textSlideshow.text = getString(R.string.body_slideshow)
    }.root
}