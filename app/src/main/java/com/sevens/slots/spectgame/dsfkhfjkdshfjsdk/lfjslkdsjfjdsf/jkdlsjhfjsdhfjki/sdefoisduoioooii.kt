package com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfjslkdsjfjdsf.jkdlsjhfjsdhfjki

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sevens.slots.spectgame.R

import com.sevens.slots.spectgame.databinding.SdefoisduoioooiiBinding
import com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfsjfdjsldjfkldsfjdsf.fgbbhjjk
import com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfsjfdjsldjfkldsfjdsf.rdtggghh


class sdefoisduoioooii : Fragment(), rdtggghh {
lateinit var binding: SdefoisduoioooiiBinding
 val presenter  = fgbbhjjk()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =SdefoisduoioooiiBinding.inflate(layoutInflater)
        presenter.rtyujjhg(this)
        }


    override fun fcfcvhg() {

        val n = 20
        val factorial = calculateFactorial(n)
        Log.d("FactorialCalculation", "Factorial of $n is $factorial")

        val nWithModulo = 30
        val modulo = 1000000
        val factorialWithModulo = calculateFactorial(nWithModulo, modulo)
        Log.d("FactorialCalculation", "Factorial of $nWithModulo modulo $modulo is $factorialWithModulo")


        binding.Bok.setOnClickListener {
            (requireActivity() as MainActivity).kjfgkljfgjk.navigate(
                R.id
                .dsofihyisfuifss)
    }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.zxcvbg()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }
}

fun calculateFactorial(i:Int,o:Int = 0):String = i.toString()