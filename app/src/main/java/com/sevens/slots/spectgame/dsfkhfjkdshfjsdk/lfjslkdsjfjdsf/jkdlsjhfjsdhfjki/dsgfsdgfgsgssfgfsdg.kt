package com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfjslkdsjfjdsf.jkdlsjhfjsdhfjki

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfjslkdsjfjdsf.uytredfg
import com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfjslkdsjfjdsf.wertoi
import com.sevens.slots.spectgame.R
import com.sevens.slots.spectgame.databinding.DsgfsdgfgsgssfgfsdgBinding
import com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.klsjddkfjsdkjf.fhjgjkfdhgjhfdg.esrvgv

class dsgfsdgfgsgssfgfsdg : Fragment(), wertoi {

    lateinit var binding: DsgfsdgfgsgssfgfsdgBinding
    val presnter = uytredfg(esrvgv)//esrvgv
//ccgitdsgdsgadd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DsgfsdgfgsgssfgfsdgBinding.inflate(layoutInflater)
        presnter.plkj(this)
        (requireContext() as MainActivity).goBack = {findNavController().navigate(R.id.bet_game)}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val n = 20

        val nWithModulo = 30
        val modulo = 1000000


        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        presnter.pouuhhj()
    }
    override fun fghjugbn() {
        binding.Button0.setOnClickListener {
            presnter.rtyu()
            binding.jdskhjksdf.text = presnter.oiuyt
        }

        binding.Button1.setOnClickListener {
            presnter.wertt()
            binding.jdskhjksdf.text = presnter.oiuyt
        }
        binding.Button2.setOnClickListener {
            presnter.rrtfg()
            binding.jdskhjksdf.text = presnter.oiuyt
        }
        binding.Button3.setOnClickListener {
            presnter.rtyuiik()
            binding.jdskhjksdf.text = presnter.oiuyt
        }
        binding.Button4.setOnClickListener {
            presnter.wertyh()
            binding.jdskhjksdf.text = presnter.oiuyt
        }
        binding.Button5.setOnClickListener {
            presnter.vcbnj()
            binding.jdskhjksdf.text = presnter.oiuyt
        }
        binding.Button6.setOnClickListener {
            presnter.qeryhh()
            binding.jdskhjksdf.text = presnter.oiuyt
        }
        binding.Button7.setOnClickListener {
            presnter.qetghjujk()
            binding.jdskhjksdf.text = presnter.oiuyt
        }
        binding.Button8.setOnClickListener {
            presnter.sdfghjk()
            binding.jdskhjksdf.text = presnter.oiuyt
        }
        binding.Button9.setOnClickListener {
            presnter.zxcvbn()
            binding.jdskhjksdf.text = presnter.oiuyt
        }
        binding.ButtonEquals.setOnClickListener {
            presnter.fgy()
            (requireActivity() as MainActivity).kjfgkljfgjk.navigate(R.id.bet_game)

        }
    }}