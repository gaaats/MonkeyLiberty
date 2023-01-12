package com.fungames.battletank.frraaaa


import androidx.fragment.app.Fragment
import com.fungames.battletank.databinding.FragmentAutorBinding
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar


class AutorFragment : Fragment() {

    private fun rfgtthyhyhy() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onDestroy() {
        fragmentAutorBinding = null
        super.onDestroy()
    }

    val f1 = "frgttgtgtggtgtgtgtgt"
    val f3 = "gtgthyhyhyhyhyhyhy"
    val f4 = "hyhyujuujujujjuujuj"
    val f5 = "yhhyhyyhhyhyhyhyhy"
    val f9 = "hyhyhyhhyhyhyhyhy"
    val f6 = "hyhyhhyyhhyhyhyhhy"
    val f7 = "hyhyjuujjuujjuju"
    val f8 = "yhyhyhhyhyhyhyhyhyhyhyhy"

    val hyophypohykhyokhykokhy = f1 +f3+f4+f5+f6+f7+f8+f9


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            if (System.currentTimeMillis()%56 == Long.MIN_VALUE) {
                rirfrfjrfjrfuifrhuhfrhfrhhrf()
            } else {
                frrfjrfjjffrfrjirf()
            }

            gtgtgtjgttgj()

        } catch (e: Exception) {
            frrfjorfijffrjifrrfjrfjrfjrfjfrjrfjrfj()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun frrfjorfijffrjifrrfjrfjrfjrfjfrjrfjrfj() {
        gtgtgt()
    }

    private fun rirfrfjrfjrfuifrhuhfrhfrhhrf() {
        fjojrfjfjrfjfrjrf()
    }

    private fun frrfjrfjjffrfrjirf() {
        Log.d("loggggglo", "res")
    }

    private fun fjojrfjfjrfjfrjrf() {
        ffrhrfuhrfhrfygfgryfrgfrgg()
    }

    private fun ffrhrfuhrfhrfygfgryfrgfrgg() {
        Snackbar.make(
            binding.root,
            hyophypohykhyokhykokhy,
            Snackbar.LENGTH_LONG
        ).show()
    }

    private fun gtgtgtjgttgj() {

        binding.bbbtnClooos.setOnClickListener {
            requireActivity().onBackPressed()
        }
        binding.btnOkkkkApp.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }




    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentAutorBinding = FragmentAutorBinding.inflate(inflater, container, false)
        return binding.root
    }

    private var fragmentAutorBinding: FragmentAutorBinding? = null
    private val binding
        get() = fragmentAutorBinding ?: throw RuntimeException("FragmentAutorBinding = null")



    private fun gtgtgt() {
        rfgtthyhyhy()
        requireActivity().onBackPressed()
    }


}