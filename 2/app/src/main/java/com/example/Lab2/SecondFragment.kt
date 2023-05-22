package com.example.Lab2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.Lab2.databinding.SecondActivityBinding

class SecondFragment : Fragment() {


    lateinit var binding: SecondActivityBinding
    lateinit var adapter: Adapter
    val navController by lazy { findNavController() }
    private var animalDesc: String? = null
    private var animalName: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondActivityBinding.inflate(layoutInflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            animalDesc = it.getString("myTextView")
            animalName = it.getString("myTextView2")
        }
        binding.textView.text = animalDesc
        binding.textView2.text = animalName

    }

}