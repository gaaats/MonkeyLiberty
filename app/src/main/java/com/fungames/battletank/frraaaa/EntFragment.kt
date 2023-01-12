package com.fungames.battletank.frraaaa

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fungames.battletank.R
import com.fungames.battletank.databinding.FragmentEntBinding
import com.fungames.battletank.tttitiimer.Timer
import com.google.android.material.snackbar.Snackbar

class EntFragment : Fragment() {

    private fun gtgtgt() {
        rfgtthyhyhy()
        rjorfojforjfrojrfjrfjrf()
    }

    private fun rjorfojforjfrojrfjrfjrf() {
        requireActivity().onBackPressed()
    }

    private fun rfgtthyhyhy() {
        rfjrifjirjjrfijrfjfrjjrfjrf("There is some error, try again")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _biiiiiiinding = FragmentEntBinding.inflate(inflater, container, false)
        return binding.root
    }

    private var _biiiiiiinding: FragmentEntBinding? = null
    private val binding
        get() = _biiiiiiinding ?: throw RuntimeException("FragmentEntBinding = null")

    var currentBet = 500



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val timer = Timer()

            val f1 = "sasffrrffr"
            val f3 = "sasffgtgttggtrrffr"
            val f4 = "sasfrgtffrrffr"
            val f5 = "sasffrgttgrffr"
            val f9 = "sasffrrffr"
            val f6 = "sasffgtgtrrffr"
            val f7 = "sasffrrffr"
            val f8 = "sasffrgtgtgtrffr"

            val res = f1 +f3+f4+f5+f6+f7+f8+f9

            var tott = "ggtgttg"

            if (tott == "rrrrr") {
                timer.startTimer()
                rfjrifjirjjrfijrfjfrjjrfjrf(res)
                timer.cancelTimer()
            } else {
            }

            gtgtgtjgttgj()

        } catch (e: Exception) {
            gtgtgt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtgtgtjgttgj() {
        frojgjtjigjijtjgtgtjjgti()

        binding.btnImgMinus.setOnClickListener {
            if (currentBet >= 101) {
                currentBet -= 100
                binding.tvUserBetCount.text = currentBet.toString()
            }
        }

        binding.btnImgRules.setOnClickListener {
            jifrijfjrfrfjrfjrfjrf()
        }
        binding.btnImgQuestion.setOnClickListener {
            gthugtghgtuhgth()
        }

        frijirfijrfijrfjfrjigthgttgh()
    }

    private fun frijirfijrfijrfjfrjigthgttgh() {
        binding.btnPlayGameeee.setOnClickListener {
            rfhhfruhhfrhrfhurfrfhrf()
        }

        binding.btnImgExit.setOnClickListener {
            requireActivity().finish()
        }
    }

    private fun rfhhfruhhfrhrfhurfrfhrf() {
        findNavController().navigate(R.id.action_entFragment_to_gameeeFragment)
    }

    private fun jifrijfjrfrfjrfjrfjrf() {
        findNavController().navigate(R.id.action_entFragment_to_abouutFragment)
    }

    private fun gthugtghgtuhgth() {
        findNavController().navigate(R.id.action_entFragment_to_autorFragment)
    }

    private fun frojgjtjigjijtjgtgtjjgti() {
        binding.btnImgPlus.setOnClickListener {
            currentBet += 100
            binding.tvUserBetCount.text = currentBet.toString()
        }
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        _biiiiiiinding = null
        super.onDestroy()
    }



    private fun rfjrifjirjjrfijrfjfrjjrfjrf(res: String) {
        Snackbar.make(
            binding.root,
            res,
            Snackbar.LENGTH_LONG
        ).show()
    }
}