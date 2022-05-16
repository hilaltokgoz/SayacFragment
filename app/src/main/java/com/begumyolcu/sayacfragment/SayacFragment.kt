package com.begumyolcu.sayacfragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.begumyolcu.sayacfragment.databinding.FragmentSayacBinding


class SayacFragment : Fragment() {
    private var _binding: FragmentSayacBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSayacBinding.inflate(inflater, container, false)
        Log.e("SayacFragment","onCreateView Çağrıldı")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("SayacFragment","onViewCreated Çağrıldı")
        val defaultVal = 0

        binding.textViewSayac.text = defaultVal.toString()

        binding.buttonSayac.setOnClickListener {
            binding.apply {
                val currentVal = textViewSayac.text.toString().toInt()
                textViewSayac.text = (currentVal+1).toString()
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("SayacFragment","onCreate Çağrıldı")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("SayacFragment","onAttach Çağrıldı")
    }

    override fun onStart() {
        super.onStart()
        Log.e("SayacFragment","onStart Çağrıldı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("SayacFragment","onResume Çağrıldı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("SayacFragment","onPause Çağrıldı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("SayacFragment","onStop Çağrıldı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("SayacFragment","onDestroy Çağrıldı")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("SayacFragment","onDestroyView Çağrıldı")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("SayacFragment","onDetach Çağrıldı")
    }



}