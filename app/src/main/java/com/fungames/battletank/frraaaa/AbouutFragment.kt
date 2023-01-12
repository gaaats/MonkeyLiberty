package com.fungames.battletank.frraaaa


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fungames.battletank.databinding.FragmentAbouutBinding
import com.google.android.material.snackbar.Snackbar


class AbouutFragment : Fragment() {


    val f1 = "frghyyyhhy"
    val f3 = "hyhyjujuuj"
    val f4 = "frgyhyujujujuuj"
    val f5 = "jujujujujuj"
    val f9 = "jujukikilololol"
    val f6 = "frftgtgyhyhhyhyyhhy"
    val f7 = "gbghnnjmjmjmj"
    val f8 = "deeft5tt6t656565655666"

    val hhyhyhyyhyhyhyh = f1 +f3+f4+f5+f6+f7+f8+f9

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            if (System.currentTimeMillis()%56 == Long.MIN_VALUE) {
                fojrfijrfjrfhhrfuhrfhrfhfr()
            } else {
            }
            gtgtgtjgttgj()

        } catch (e: Exception) {
            rfjrfojrfijrfjrf()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun rfjrfojrfijrfjrf() {
        gtgtgt()
    }

    private fun fojrfijrfjrfhhrfuhrfhrfhfr() {
        Snackbar.make(
            binding.root,
            hhyhyhyyhyhyhyh,
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun gtgtgtjgttgj() {

        binding.bbbtnClooos.setOnClickListener {
            fkrogtjtgijgtjgtjgtj()
        }
        binding.btnOkkkk.setOnClickListener {
            fkrogtjtgijgtjgtjgtj()
        }
    }


    var fragmentAbouutBinding: FragmentAbouutBinding? = null
    val binding
        get() = fragmentAbouutBinding ?: throw RuntimeException("FragmentAbouutBinding = null")



    private fun gtgtgt() {
        rfgtthyhyhy()
        fkrogtjtgijgtjgtjgtj()
    }

    private fun fkrogtjtgijgtjgtjgtj() {
        requireActivity().onBackPressed()
    }

    private fun rfgtthyhyhy() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentAbouutBinding = FragmentAbouutBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentAbouutBinding = null
        super.onDestroy()
    }




}