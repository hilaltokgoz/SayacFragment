package com.begumyolcu.sayacfragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.begumyolcu.sayacfragment.databinding.FragmentGirisBinding
import com.begumyolcu.sayacfragment.databinding.FragmentSayacBinding

class GirisFragment : Fragment() {
    private var _binding: FragmentGirisBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGirisBinding.inflate(inflater, container, false)
        Log.e("GirisFragment","onCreateView Çağrıldı")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("GirisFragment","onViewCreated Çağrıldı")
        binding.buttonGiris.setOnClickListener {
            it.findNavController().navigate(R.id.action_girisToSayac)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("GirisFragment","onCreate Çağrıldı")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("GirisFragment","onAttach Çağrıldı")
    }

    override fun onStart() {
        super.onStart()
        Log.e("GirisFragment","onStart Çağrıldı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("GirisFragment","onResume Çağrıldı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("GirisFragment","onPause Çağrıldı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("GirisFragment","onStop Çağrıldı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("GirisFragment","onDestroy Çağrıldı")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("GirisFragment","onDestroyView Çağrıldı")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("GirisFragment","onDetach Çağrıldı")
    }

}