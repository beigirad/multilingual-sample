package ir.beigirad.multilingual.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.beigirad.multilingual.R
import ir.beigirad.multilingual.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentGalleryBinding.inflate(inflater, container, false).apply {
        textGallery.text = getString(R.string.body_gallery)
    }.root
}