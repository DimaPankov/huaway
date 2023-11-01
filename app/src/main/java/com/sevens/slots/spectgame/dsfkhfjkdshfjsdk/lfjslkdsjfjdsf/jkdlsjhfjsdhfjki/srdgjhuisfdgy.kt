package com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfjslkdsjfjdsf.jkdlsjhfjsdhfjki

//caswm.maionaawq.aafehxuj

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import com.sevens.slots.spectgame.R
import com.sevens.slots.spectgame.databinding.SrdgjhuisfdgyBinding

import com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.klsjddkfjsdkjf.qwwerd
import com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.klsjddkfjsdkjf.wertyhbj
import com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.klsjddkfjsdkjf.fhjgjkfdhgjhfdg.esrvgv
import com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.klsjddkfjsdkjf.fhjgjkfdhgjhfdg.werfgy
import com.sevens.slots.spectgame.wetgghj


class srdgjhuisfdgy : Fragment(), qwwerd {
    var clickDrawableButton = 0
    var drawable = 0
    var firstClick = true

    val fdjklfdjgkfdjg = wertyhbj(esrvgv)
    val binding by lazy { SrdgjhuisfdgyBinding.inflate(layoutInflater) }
    private var countMiliSecond:Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        if(wetgghj.poiiuuhfd){
   //        (requireContext() as MainActivity). binding.CVregistration.isVisible = true
        }

        (requireContext() as MainActivity).binding.Bclose.setOnClickListener{
            (requireContext() as MainActivity). binding.CVregistration.isVisible = false
            wetgghj.poiiuuhfd = false
        }
        (requireContext() as MainActivity).binding.Blogin.setOnClickListener {
            (requireContext() as MainActivity). binding.CVregistration.isVisible = false
            wetgghj.poiiuuhfd = false
        }

        (requireContext() as MainActivity).goBack = {exitAppPlusToast()}

        fdjklfdjgkfdjg.erfgf(this)
        binding.ksgfhfksjghjsd.alpha = 0F
        binding.jdsfhfjkgh.alpha = 0F

        binding.CVtwo.alpha = 0F
       binding.TVbalans.text = werfgy(requireContext()).jhgfcv().toString()

        drawable = wetgghj.esrtghoo()
        binding.IVbonus.setImageResource(drawable)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root

    }

    override fun onDestroy() {
        super.onDestroy()
        fdjklfdjgkfdjg.fghhjj()
    }



    override fun ddfcgvh() {
        binding.TVinfo.setOnClickListener {
            (requireActivity() as MainActivity).kjfgkljfgjk.navigate(R.id.fsndsefsf)
        }
    }

    override fun wertfg() {

        binding.skdljfjklsdf.setOnClickListener {
         //   presenter.setSlots()
            binding.skdljfjklsdf.isClickable = false
            binding.jhsdfjkgfsdh.isVisible = false
            binding.lkdsjflksdj.isVisible = false
            binding.jfdsjf.isVisible = false


            if ((fdjklfdjgkfdjg.rttuhbh() >= fdjklfdjgkfdjg.dffvbhh())
                ) {
                    val heidht = binding.sdfgsdg.height.toFloat()
                    val heidhtConteiner = binding.constraintLayout .height.toFloat()

                    fdjklfdjgkfdjg.poiiuuhuh(
                        binding.fksjgklfjg,
                        binding.dsjfhjdshfjdf,
                        binding.fsgfdgfd,
                        binding.sdfgsdg,
                        binding.yjluyigrsfd,
                        binding.fdhjyitrgsfd,
                        binding.fgfdgergsfv,
                        fdjklfdjgkfdjg.dfvv,
                        fdjklfdjgkfdjg.ertg,
                        fdjklfdjgkfdjg.wertg,
                        heidht,
                        heidhtConteiner,
                0)

                    fdjklfdjgkfdjg.poiiuuhuh(
                        binding.TVslot53q,
                        binding.TVslot56q,
                        binding.TVslot59q,
                        binding.TVslot2,
                        binding.TVslot5,
                        binding.TVslot8,
                        binding.LLline2,
                        fdjklfdjgkfdjg.erfv,
                        fdjklfdjgkfdjg.pookjkjh,
                        fdjklfdjgkfdjg.pkojkhj,
                        heidht,
                        heidhtConteiner,1000)

                    fdjklfdjgkfdjg.poiiuuhuh(
                        binding.TVslot54q,
                        binding.TVslot57q,
                        binding.TVslot60q,
                        binding.TVslot3,
                        binding.TVslot6,
                        binding.TVslot9,
                        binding.LLline3,
                        fdjklfdjgkfdjg.vcbvbnj,
                        fdjklfdjgkfdjg.cvbhh,
                        fdjklfdjgkfdjg.zxcffg,
                        heidht,
                        heidhtConteiner,2000)

            fdjklfdjgkfdjg.ddfvgh(fdjklfdjgkfdjg.dffvbhh(), false)
            binding.TVbalans.text = fdjklfdjgkfdjg.rttuhbh().toString()

            fdjklfdjgkfdjg.ererrtyg( binding.sdfgsdg, binding.TVslot2, binding.TVslot3,binding.betCount,
                                     binding.betCountSmile,binding.TVvin,binding.TVxxx,binding.jhsdfjkgfsdh,
                                      binding.CVresult,binding.TVbalans,1,{})

            fdjklfdjgkfdjg.ererrtyg( binding.yjluyigrsfd, binding.TVslot5, binding.TVslot6,binding.betCount,
                        binding.betCountSmile,binding.TVvin,binding.TVxxx,binding.lkdsjflksdj,
                        binding.CVresult,binding.TVbalans,2,{})

            fdjklfdjgkfdjg.ererrtyg( binding.fdhjyitrgsfd, binding.TVslot8, binding.TVslot9,binding.betCount,
                        binding.betCountSmile,binding.TVvin,binding.TVxxx,binding.jfdsjf,
                        binding.CVresult,binding.TVbalans,3,{})



                } else {
                    (requireActivity() as MainActivity).kjfgkljfgjk.navigate(R.id
                        .action_game_new_coins)

                    fdjklfdjgkfdjg.plllb = true
                }
            Handler(Looper.getMainLooper()).postDelayed({
                binding.skdljfjklsdf.isClickable = true },5000)
            /*
            DataBasePreferences(requireContext()).setBalans(presenter.getMainCont()+
                    presenter.betCountXXX)*/
            fdjklfdjgkfdjg.dfgfgbhjj(requireContext(),fdjklfdjgkfdjg.rttuhbh()+
                    fdjklfdjgkfdjg.fdfgghh)
            fdjklfdjgkfdjg.fghjjj()
        }


    }

            override fun esrfgh() {
              //  binding.IVback.setOnClickListener {
              //      (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_mainFragment)
              //  }
            }

            override fun ghuiikhb() {
                binding.Bbet.setOnClickListener {
                    fdjklfdjgkfdjg.plmnjhg(0)//BET = 0
                    (requireActivity() as MainActivity).kjfgkljfgjk.navigate(R.id.action_game_bet)
                }
            }
            override fun ffcvhhj() {
                binding.TVbalans.text = esrvgv.qwwerr().toString()
                binding.betCountMinus.text = esrvgv.wertgv().toString()
                fdjklfdjgkfdjg.fghjjj()
                binding.sdfgsdg.setImageResource(fdjklfdjgkfdjg.wertg)
                binding.TVslot2.setImageResource(fdjklfdjgkfdjg.pkojkhj)
                binding.TVslot3.setImageResource(fdjklfdjgkfdjg.zxcffg)
                binding.yjluyigrsfd.setImageResource(fdjklfdjgkfdjg.ertg)
                binding.TVslot5.setImageResource(fdjklfdjgkfdjg.pookjkjh)
                binding.TVslot6.setImageResource(fdjklfdjgkfdjg.cvbhh)
                binding.fdhjyitrgsfd.setImageResource(fdjklfdjgkfdjg.wertg)
                binding.TVslot8.setImageResource(fdjklfdjgkfdjg.pkojkhj)
                binding.TVslot9.setImageResource(fdjklfdjgkfdjg.zxcffg)
                binding.TVslot10.setImageResource(esrvgv.rtty.random())
                binding.TVslot11.setImageResource(esrvgv.rtty.random())
                binding.TVslot12.setImageResource(esrvgv.rtty.random())
                binding.TVslot13.setImageResource(esrvgv.rtty.random())
                binding.TVslot14.setImageResource(esrvgv.rtty.random())
                binding.TVslot15.setImageResource(esrvgv.rtty.random())
                binding.TVslot16.setImageResource(esrvgv.rtty.random())
                binding.TVslot17.setImageResource(esrvgv.rtty.random())
                binding.TVslot18.setImageResource(esrvgv.rtty.random())
                binding.TVslot19.setImageResource(esrvgv.rtty.random())
                binding.TVslot20.setImageResource(esrvgv.rtty.random())
                binding.TVslot21.setImageResource(esrvgv.rtty.random())
                binding.TVslot22.setImageResource(esrvgv.rtty.random())
                binding.TVslot23.setImageResource(esrvgv.rtty.random())
                binding.TVslot24.setImageResource(esrvgv.rtty.random())
                binding.TVslot25.setImageResource(esrvgv.rtty.random())
                binding.TVslot26.setImageResource(esrvgv.rtty.random())
                binding.TVslot27.setImageResource(esrvgv.rtty.random())
                binding.TVslot28.setImageResource(esrvgv.rtty.random())
                binding.TVslot29.setImageResource(esrvgv.rtty.random())
                binding.TVslot30.setImageResource(esrvgv.rtty.random())
                binding.TVslot31.setImageResource(esrvgv.rtty.random())
                binding.TVslot32.setImageResource(esrvgv.rtty.random())
                binding.TVslot33.setImageResource(esrvgv.rtty.random())
                binding.TVslot34.setImageResource(esrvgv.rtty.random())
                binding.TVslot35.setImageResource(esrvgv.rtty.random())
                binding.TVslot36.setImageResource(esrvgv.rtty.random())
                binding.TVslot37.setImageResource(esrvgv.rtty.random())
                binding.TVslot38.setImageResource(esrvgv.rtty.random())
                binding.TVslot39.setImageResource(esrvgv.rtty.random())
                binding.TVslot40.setImageResource(esrvgv.rtty.random())
                binding.TVslot41.setImageResource(esrvgv.rtty.random())
                binding.TVslot42.setImageResource(esrvgv.rtty.random())
                binding.TVslot43.setImageResource(esrvgv.rtty.random())
                binding.TVslot44.setImageResource(esrvgv.rtty.random())
                binding.TVslot45.setImageResource(esrvgv.rtty.random())
                binding.TVslot46.setImageResource(esrvgv.rtty.random())
                binding.TVslot47.setImageResource(esrvgv.rtty.random())
                binding.TVslot48.setImageResource(esrvgv.rtty.random())
                binding.TVslot49.setImageResource(esrvgv.rtty.random())
                binding.TVslot50.setImageResource(esrvgv.rtty.random())
                binding.TVslot52.setImageResource(esrvgv.rtty.random())
                binding.TVslot53.setImageResource(esrvgv.rtty.random())
                binding.TVslot54.setImageResource(esrvgv.rtty.random())
                binding.TVslot55.setImageResource(esrvgv.rtty.random())
                binding.TVslot55.setImageResource(esrvgv.rtty.random())
                binding.TVslot56.setImageResource(esrvgv.rtty.random())
                binding.TVslot57.setImageResource(esrvgv.rtty.random())
                binding.TVslot58.setImageResource(esrvgv.rtty.random())
                binding.TVslot59.setImageResource(esrvgv.rtty.random())
                binding.TVslot1q.setImageResource(esrvgv.rtty.random())
                binding.TVslot2q.setImageResource(esrvgv.rtty.random())
                binding.TVslot3q.setImageResource(esrvgv.rtty.random())
                binding.TVslot4q.setImageResource(esrvgv.rtty.random())
                binding.TVslot5q.setImageResource(esrvgv.rtty.random())
                binding.TVslot6q.setImageResource(esrvgv.rtty.random())
                binding.TVslot7q.setImageResource(esrvgv.rtty.random())
                binding.TVslot8q.setImageResource(esrvgv.rtty.random())
                binding.TVslot9q.setImageResource(esrvgv.rtty.random())
                binding.TVslot10q.setImageResource(esrvgv.rtty.random())
                binding.TVslot11q.setImageResource(esrvgv.rtty.random())
                binding.TVslot12q.setImageResource(esrvgv.rtty.random())
                binding.TVslot13q.setImageResource(esrvgv.rtty.random())
                binding.TVslot14q.setImageResource(esrvgv.rtty.random())
                binding.TVslot15q.setImageResource(esrvgv.rtty.random())
                binding.TVslot16q.setImageResource(esrvgv.rtty.random())
                binding.TVslot17q.setImageResource(esrvgv.rtty.random())
                binding.TVslot18q.setImageResource(esrvgv.rtty.random())
                binding.TVslot19q.setImageResource(esrvgv.rtty.random())
                binding.TVslot20q.setImageResource(esrvgv.rtty.random())
                binding.TVslot21q.setImageResource(esrvgv.rtty.random())
                binding.TVslot22q.setImageResource(esrvgv.rtty.random())
                binding.TVslot23q.setImageResource(esrvgv.rtty.random())
                binding.TVslot24q.setImageResource(esrvgv.rtty.random())
                binding.TVslot25q.setImageResource(esrvgv.rtty.random())
                binding.TVslot26q.setImageResource(esrvgv.rtty.random())
                binding.TVslot27q.setImageResource(esrvgv.rtty.random())
                binding.TVslot28q.setImageResource(esrvgv.rtty.random())
                binding.TVslot29q.setImageResource(esrvgv.rtty.random())
                binding.TVslot30q.setImageResource(esrvgv.rtty.random())
                binding.TVslot31q.setImageResource(esrvgv.rtty.random())
                binding.TVslot32q.setImageResource(esrvgv.rtty.random())
                binding.TVslot33q.setImageResource(esrvgv.rtty.random())
                binding.TVslot34q.setImageResource(esrvgv.rtty.random())
                binding.TVslot35q.setImageResource(esrvgv.rtty.random())
                binding.TVslot36q.setImageResource(esrvgv.rtty.random())
                binding.TVslot37q.setImageResource(esrvgv.rtty.random())
                binding.TVslot38q.setImageResource(esrvgv.rtty.random())
                binding.TVslot39q.setImageResource(esrvgv.rtty.random())
                binding.TVslot40q.setImageResource(esrvgv.rtty.random())
                binding.TVslot41q.setImageResource(esrvgv.rtty.random())
                binding.TVslot42q.setImageResource(esrvgv.rtty.random())
                binding.TVslot43q.setImageResource(esrvgv.rtty.random())
                binding.TVslot44q.setImageResource(esrvgv.rtty.random())
                binding.TVslot45q.setImageResource(esrvgv.rtty.random())
                binding.TVslot46q.setImageResource(esrvgv.rtty.random())
                binding.TVslot47q.setImageResource(esrvgv.rtty.random())
                binding.TVslot48q.setImageResource(esrvgv.rtty.random())
                binding.TVslot49q.setImageResource(esrvgv.rtty.random())
                binding.TVslot50q.setImageResource(esrvgv.rtty.random())
                binding.TVslot51q.setImageResource(esrvgv.rtty.random())
                binding.fksjgklfjg.setImageResource(fdjklfdjgkfdjg.wertg)
                binding.TVslot53q.setImageResource(fdjklfdjgkfdjg.pkojkhj)
                binding.TVslot54q.setImageResource(fdjklfdjgkfdjg.zxcffg)
                binding.dsjfhjdshfjdf.setImageResource(fdjklfdjgkfdjg.ertg)
                binding.TVslot56q.setImageResource(fdjklfdjgkfdjg.pookjkjh)
                binding.TVslot57q.setImageResource(fdjklfdjgkfdjg.cvbhh)
                binding.fsgfdgfd.setImageResource(fdjklfdjgkfdjg.wertg)
                binding.TVslot59q.setImageResource(fdjklfdjgkfdjg.pkojkhj)
                binding.TVslot60q.setImageResource(fdjklfdjgkfdjg.zxcffg)
            }

    override fun opkojkhjgh() {
        binding.Bok.setOnClickListener {
            binding.CVresult.alpha = 0F
            binding.CVresult.y = -600F
        }
    }
    private fun exitAppPlusToast(){  if (countMiliSecond+2000 > System.currentTimeMillis()) {
        (requireContext() as MainActivity).onBackPressed()
    } else {
        Toast.makeText(requireContext(), "Press the back button twice to exit", Toast.LENGTH_SHORT).show()
    }
        countMiliSecond = System.currentTimeMillis()
    }

    fun clickBonus() {

        drawable = wetgghj.esrtghoo()
        binding.IVbonus.setImageResource(drawable)

        if (firstClick) {
            binding.IVbonus.setImageResource(wetgghj.esrtghoo())
            Handler(Looper.getMainLooper()).postDelayed({
                val animator1 = ObjectAnimator.ofFloat(binding.CVtwo, View.TRANSLATION_Y, -600F)
                animator1.duration = 1000
                animator1.start()

                val animator2 = ObjectAnimator.ofFloat(binding.CVtwo, View.ALPHA, 0F)
                animator2.duration = 1000
                animator2.start()
            }, 500)

            wetgghj.wetggh = wetgghj.wetggh * 2
            fdjklfdjgkfdjg.eqrwyg = wetgghj.wetggh
            binding.TVbalans.text = wetgghj.wetggh.toString()


            val animator1 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.TRANSLATION_Y, -600F)
            animator1.duration = 500
            animator1.start()

            val animator2 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.ALPHA, 0F)
            animator2.duration = 500
            animator2.start()

            val animator3 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.ROTATION, -50F)
            animator3.duration = 500
            animator3.start()

            val animator4 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.TRANSLATION_Y, -600F)
            animator4.duration = 500
            animator4.start()

            val animator5 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.TRANSLATION_X, -600F)
            animator5.duration = 500
            animator5.start()

            val animator6 = ObjectAnimator.ofFloat(binding.ksgfhfksjghjsd, View.SCALE_X, 0.8F)
            animator6.duration = 0
            animator6.start()

            val animator7 = ObjectAnimator.ofFloat(binding.ksgfhfksjghjsd, View.SCALE_Y, 0.8F)
            animator7.duration = 0
            animator7.start()

            val animator8 = ObjectAnimator.ofFloat(binding.ksgfhfksjghjsd, View.SCALE_X, 1F)
            animator8.duration = 250
            animator8.start()

            val animator9 = ObjectAnimator.ofFloat(binding.ksgfhfksjghjsd, View.SCALE_Y, 1F)
            animator9.duration = 250
            animator9.start()

            Handler(Looper.getMainLooper()).postDelayed({
                val animator1 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.TRANSLATION_Y, 600F)
                animator1.duration = 0
                animator1.start()

                val animator2 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.ALPHA, 1F)
                animator2.duration = 0
                animator2.start()

                val animator3 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.ROTATION, 0F)
                animator3.duration = 0
                animator3.start()

                val animator4 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.TRANSLATION_Y, 0F)
                animator4.duration = 0
                animator4.start()

                val animator5 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.TRANSLATION_X, 0F)
                animator5.duration = 0
                animator5.start()
                binding.IVbonusThree.setImageResource(drawable)

                if (drawable !== clickDrawableButton) {

                    wetgghj.wetggh = wetgghj.wetggh * 2
                    binding.TVbalans.text = wetgghj.wetggh.toString()

                } else {
                    val animator1 = ObjectAnimator.ofFloat(binding.ksgfhfksjghjsd, View.ALPHA, 0F)
                    animator1.duration = 500
                    animator1.start()
                    val animator2 = ObjectAnimator.ofFloat(binding.jdsfhfjkgh, View.ALPHA, 0F)
                    animator2.duration = 500
                    animator2.start()


                    binding.ksgfhfksjghjsd.isClickable = false
                    binding.jdsfhfjkgh.isClickable = false
                    //binding.TVbetWin.isClickable = false
                    Handler(Looper.getMainLooper()).postDelayed({
                        fdjklfdjgkfdjg.tqyhbfjfj(
                            binding.CVresult,binding.betCount,binding.TVbalans,
                            binding.TVxxx )
                        fdjklfdjgkfdjg.eqrwyg = 0
                    },500)
                }
            }, 500)

            Handler(Looper.getMainLooper()).postDelayed({
            fdjklfdjgkfdjg.eqrwyg = 0
            },2000)

        }
    }}


