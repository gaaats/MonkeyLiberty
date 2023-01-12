package com.fungames.battletank.frraaaa


import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.fungames.battletank.R
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fungames.battletank.adapteeeer.OIJJjjjji
import com.fungames.battletank.adapteeeer.SlotListAdapter
import com.fungames.battletank.databinding.FragmentGameeeBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class GameeeFragment : Fragment() {


    val f1 = "sasffrrffr"
    val f3 = "sasffgtgttggtrrffr"
    val f4 = "sasfrgtffrrffr"
    val f5 = "sasffrgttgrffr"
    val f9 = "sasffrrffr"
    val f6 = "sasffgtgtrrffr"
    val f7 = "sasffrrffr"
    val f8 = "sasffrgtgtgtrffr"


    private var tgtgtgt5 = 300

    val res = f1 +f3+f4+f5+f6+f7+f8+f9

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        frgyhyjuji = FragmentGameeeBinding.inflate(inflater, container, false)
        return fragmentGameeeBinding.root
    }


    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (test == "gtgtgtgtgttgthjujikkkiigtgt"){
            gtgtjgtjgt()
        }

        frifjrjjfijjjrfirjfjrfghhgthgt()
        gtjijgtjgtjigtjjgti()
        gtjigtjtgjjgtjigt()


        bgnhnhnhhnbgbgbgbgbg()
        val rrfrfrf = fragmentGameeeBinding.recVLeft.layoutManager as LinearLayoutManager
        val bnhnhhn = fragmentGameeeBinding.recVCenter.layoutManager as LinearLayoutManager
        val frgthyhyhyyh = fragmentGameeeBinding.recVRight.layoutManager as LinearLayoutManager

        frgtgtgtjgtjijgtjgtjgtj()
        kujokkujkjuopuj()
        kjukujokjukuiju()

        gtuhgtgthgtddhdgdgd(
            rrfrfrf,
            bnhnhhn,
            frgthyhyhyyh
        )
        super.onViewCreated(view, savedInstanceState)
    }

    private fun frifjrjjfijjjrfirjfjrfghhgthgt() {
        friggthigthgtuhgtuhgt()
    }

    private fun friggthigthgtuhgtuhgt() {
        fragmentGameeeBinding.root.background.alpha = 230
    }

    private fun gtgtjgtjgt() {
        Snackbar.make(
            fragmentGameeeBinding.root,
            "You win $res points",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private fun gtuhgtgthgtddhdgdgd(
        linearLayoutManagerLeftdferfgtghyt: LinearLayoutManager,
        linearLayoutManagerCenterrrrrrrr: LinearLayoutManager,
        frgthyhyhyyh: LinearLayoutManager
    ) {
        gtgththghffhfnv(
            linearLayoutManagerLeftdferfgtghyt,
            linearLayoutManagerCenterrrrrrrr,
            frgthyhyhyyh
        )
    }

    private fun gtgththghffhfnv(
        linearLayoutManagerLeftdferfgtghyt: LinearLayoutManager,
        linearLayoutManagerCenterrrrrrrr: LinearLayoutManager,
        frgthyhyhyyh: LinearLayoutManager
    ) {
        fragmentGameeeBinding.btnGoSpin.setOnClickListener {
            hyyhhyhyhyhyhyhyhy(linearLayoutManagerLeftdferfgtghyt, 8, 12)
            hyyhhyhyhyhyhyhyhy(linearLayoutManagerCenterrrrrrrr, 12, 18)
            hyyhhyhyhyhyhyhyhy(frgthyhyhyyh, 20, 27)
        }
    }

    private val hyyhyhytggt5gt5gtgt56gt6gt = SlotListAdapter()
    private val gtgtgthyhyhyhy48 = SlotListAdapter()


    private var frgyhyjuji: FragmentGameeeBinding? = null
    private val ftgtgtg = SlotListAdapter()


    val test = "gtgtgttggt"



    private fun gtjijgtjgtjigtjjgti() {
        fragmentGameeeBinding.tvUserBetCountMoney.text = tgtgtgt5.toString()
    }

    private fun bgnhnhnhhnbgbgbgbgbg() {
        fragmentGameeeBinding.btnImgExittttttMoney.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    private fun gtjigtjtgjjgtjigt() {
        fragmentGameeeBinding.btnImgPlusMoney.setOnClickListener {
            tgtgtgt5 += 100
            fragmentGameeeBinding.tvUserBetCountMoney.text = tgtgtgt5.toString()
        }
        fragmentGameeeBinding.btnImgMinusMoney.setOnClickListener {
            if (tgtgtgt5 >= 100) tgtgtgt5 -= 100
            fragmentGameeeBinding.tvUserBetCountMoney.text = tgtgtgt5.toString()
        }
    }


    private fun kjukujokjukuiju() {
        hyyhyhytggt5gt5gtgt56gt6gt.submitList(frgtghyhyhyhhy())
        gtgtgthyhyhyhy48.submitList(frgtghyhyhyhhy())
        ftgtgtg.submitList(frgtghyhyhyhhy())
    }

    override fun onDestroy() {
        frgyhyjuji = null
        super.onDestroy()
    }




    @SuppressLint("ClickableViewAccessibility")
    private fun frgtgtgtjgtjijgtjgtjgtj() {
        fragmentGameeeBinding.recVLeft.setOnTouchListener { _, _ -> true }
        fragmentGameeeBinding.recVRight.setOnTouchListener { _, _ -> true }
        fragmentGameeeBinding.recVCenter.setOnTouchListener { _, _ -> true }
    }

    private fun hyyhhyhyhyhyhyhyhy(
        linearLayoutManager: LinearLayoutManager,
        minNumberScrolling: Int,
        maxNumberScrolling: Int
    ) {
        lifecycleScope.launch {
            val numberTopdrfgtgtgt = Random.nextInt(minNumberScrolling, maxNumberScrolling)
            var timeForDelayLeftfrgtgtgt = 100L
            for (i in 1..numberTopdrfgtgtgt) {
                linearLayoutManager.scrollToPositionWithOffset(i, 0)
                delay(timeForDelayLeftfrgtgtgt)
                timeForDelayLeftfrgtgtgt += 5
            }
            if (maxNumberScrolling == 27) {
                Snackbar.make(
                    fragmentGameeeBinding.root,
                    "You have ${Random.nextInt(from = 300, until = 5000)} points",
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }


    private fun kujokkujkjuopuj() {
        fragmentGameeeBinding.recVLeft.adapter = hyyhyhytggt5gt5gtgt56gt6gt
        fragmentGameeeBinding.recVRight.adapter = gtgtgthyhyhyhy48
        fragmentGameeeBinding.recVCenter.adapter = ftgtgtg
    }


    private val rftgyhyhyy = dfrgtthyhyy56()
    private val fragmentGameeeBinding get() = frgyhyjuji ?: throw RuntimeException("FragmentGameeeBinding = null")

    private fun dfrgtthyhyy56(): List<Int> {
        return listOf(
            R.drawable.ice_joker_hp_star,
            R.drawable.ice_joker_lp_cherry,
            R.drawable.ice_joker_lp_grape,
            R.drawable.ice_joker_scatter,
            R.drawable.ice_joker_lp_lemon,
            R.drawable.ice_joker_lp_plum,
        )
    }

    private fun frgtghyhyhyhhy(): List<OIJJjjjji> {
        val preList = mutableListOf<OIJJjjjji>()
        for (i in 1..50) {
            preList.add(
                OIJJjjjji(
                    Random.nextInt(Int.MAX_VALUE),
                    rftgyhyhyy.random(),
                )
            )
        }
        return preList
    }


}