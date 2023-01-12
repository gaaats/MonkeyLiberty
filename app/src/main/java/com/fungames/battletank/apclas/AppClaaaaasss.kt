package com.fungames.battletank.apclas

import android.app.Application
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.orhanobut.hawk.Hawk
import java.util.*
import com.my.tracker.MyTracker
import com.onesignal.OneSignal


class AppClaaaaasss:Application() {

    private fun ujkikiikii() {
        ightugtughhgthgth()
    }

    override fun onCreate() {
        super.onCreate()

        ujkikiikii()

        frrjgitjjgtijgtjgtjgtj()

        val trackerParamsfrrr = MyTracker.getTrackerParams()
        val gtgttggtgtg = getSharedPreferences("PREFS_NAME", 0)
        val hyyhhyhyyhhy = MyTracker.getTrackerConfig()
        val hyjuujujikkiikikik = MyTracker.getInstanceId(this)
        hyyhhyhyyhhy.isTrackingLaunchEnabled = true
        if (gtgttggtgtg.getBoolean("my_first_time", true)) {
            val bgbnhnhhnhyhyhyhy = UUID.randomUUID().toString()
            trackerParamsfrrr.setCustomUserId(bgbnhnhhnhyhyhyhy)
            Hawk.put(gtkkgt, bgbnhnhhnhyhyhyhy)
            Hawk.put(gktkogt, hyjuujujikkiikikik)
            gtgttggtgtg.edit().putBoolean("my_first_time", false).apply()

        } else {
            val fgrrrrr = Hawk.get(gtkkgt, "null")
            trackerParamsfrrr.setCustomUserId(fgrrrrr)
        }
        vfgbgyyuu()

    }

    private fun frrjgitjjgtijgtjgtjgtj() {
        Hawk.init(this).build()
    }

    companion object {
        const val gtjigtijtgi = "bafdded4-4188-478c-8d1e-2406d7675e9c"
        var gtjgtjjgti: String? = "c11"
        var gtkkgt: String? = "myID"
        var apapapapdjfjhf = "appsChecker"
        var gktkogt: String? = "instID"
        var lllllinnka = "link"
        //доне
        const val tigtjigt = "49773012451029603571"
        var ididid: String? = ""



    }

    private fun vfgbgyyuu() {
        MyTracker.initTracker(tigtjigt, this)
    }



    private fun ightugtughhgthgth() {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(gtjigtijtgi)
    }


}

@Keep
data class Devvvviiillly(
    @SerializedName("geo")
    val frrffrrfrfrf: String,
    @SerializedName("view")
    val hykohkkk: String,
    @SerializedName("appsChecker")
    val gtuitgiuhtughgtiuhgth: String,
)

