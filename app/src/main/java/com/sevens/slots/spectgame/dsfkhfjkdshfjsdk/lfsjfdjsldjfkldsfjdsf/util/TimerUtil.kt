package com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfsjfdjsldjfkldsfjdsf.util

import android.os.CountDownTimer
import android.widget.TextView

class TimerUtil(private val textView: TextView) {

    private lateinit var countDownTimer: CountDownTimer

    fun startTimer(action: () -> Unit ) {
        countDownTimer = object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = millisUntilFinished / 1000
                textView.text = "$secondsRemaining"
            }

            override fun onFinish() {
                textView.text = "0"

            }
        }
        countDownTimer.start()
    }

    fun stopTimer() {
        if (::countDownTimer.isInitialized) {
            countDownTimer.cancel()
        }
    }
}



