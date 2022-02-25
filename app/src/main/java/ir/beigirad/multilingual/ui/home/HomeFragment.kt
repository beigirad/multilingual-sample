package ir.beigirad.multilingual.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.beigirad.multilingual.R
import ir.beigirad.multilingual.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentHomeBinding.inflate(inflater, container, false).apply {
        textHome.text = getString(R.string.body_home)
    }.root
}