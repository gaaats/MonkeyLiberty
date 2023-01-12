package com.fungames.battletank.accctiv



import com.fungames.battletank.apclas.AppClaaaaasss.Companion.ididid
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.fungames.battletank.apclas.AppClaaaaasss.Companion.lllllinnka
import com.fungames.battletank.databinding.ActivityViieeevVeebiBinding
import com.appsflyer.AppsFlyerLib
import com.fungames.battletank.R
import com.fungames.battletank.apclas.AppClaaaaasss
import android.webkit.*
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.fungames.battletank.apclas.AppClaaaaasss.Companion.gtjgtjjgti
import com.google.android.material.snackbar.Snackbar
import java.io.File
import java.io.IOException
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.launch
import org.json.JSONException
import org.json.JSONObject


class ViieeevVeebiActivity : AppCompatActivity() {

    private fun cdbcdgdedetfsftfsxsxscxs() {
        val vffvnvfnjvf = bgnnhhhyhyyhgtgt.settings
        vffvnvfnjvf.javaScriptEnabled = true

        vffvnvfnjvf.useWideViewPort = true

        vffvnvfnjvf.loadWithOverviewMode = true
        vffvnvfnjvf.allowFileAccess = true
        vffvnvfnjvf.domStorageEnabled = true
        vffvnvfnjvf.userAgentString = vffvnvfnjvf.userAgentString.replace("; wv", "")

        vffvnvfnjvf.javaScriptCanOpenWindowsAutomatically = true
        vffvnvfnjvf.setSupportMultipleWindows(false)

        vffvnvfnjvf.displayZoomControls = false
        vffvnvfnjvf.builtInZoomControls = true
        vffvnvfnjvf.setSupportZoom(true)

        vffvnvfnjvf.pluginState = WebSettings.PluginState.ON
        vffvnvfnjvf.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        vffvnvfnjvf.setAppCacheEnabled(true)

        vffvnvfnjvf.allowContentAccess = true
    }

    val bgbgbg6gb6bgb3g = "com.fungames.battletank"
    private val gthyy5 = 1
    var kiki5ik59k5lo95: String? = null
    var bgbg6gb56gb5gt5tg: ValueCallback<Array<Uri>>? = null

    lateinit var bgnnhhhyhyyhgtgt: WebView
    lateinit var fvfrrgtgttgtg: ActivityViieeevVeebiBinding

    private fun fjrfirfirfjrffr() {
        Snackbar.make(
            fvfrrgtgttgtg.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fvfrrgtgttgtg = ActivityViieeevVeebiBinding.inflate(layoutInflater)
        setContentView(fvfrrgtgttgtg.root)

        bgnnhhhyhyyhgtgt = fvfrrgtgttgtg.viiiev
        gtughgthgtgth()

        val gtgtkogtgtk = CookieManager.getInstance()
        gtgtkogtgtk.setAcceptCookie(true)
        gtgtkogtgtk.setAcceptThirdPartyCookies(bgnnhhhyhyyhgtgt, true)
        cdbcdgdedetfsftfsxsxscxs()

        val gtgtgtgt = "sasffrrffr"
        val vffrfrdesqaqa = "sasffgtgttggtrrffr"
        val frfgthyujuikmmjnn = "sasfrgtffrrffr"
        val f5 = "sasffrgttgrffr"
        val f9 = "sasffrrffr"
        val vfdssxxzaaaaq = "sasffgtgtrrffr"
        val f7 = "sasffrrffr"
        val hyjujukikimnvcvcssasa = "sasffrgtgtgtrffr"

        val res = gtgtgtgt +vffrfrdesqaqa+frfgthyujuikmmjnn+f5+vfdssxxzaaaaq+f7+hyjujukikimnvcvcssasa+f9


        if (res == "fggtgt"){
            Snackbar.make(
                fvfrrgtgttgtg.root, "frrfrf $res",
                Snackbar.LENGTH_LONG
            ).show()
        }


        val hyhhyhyhy5hy5hy56 = gjitijgtjitg()
        Log.d("looggg", "frrfrfrf $hyhhyhyhy5hy5hy56")



        val activity: Activity = this
        bgnnhhhyhyyhgtgt.webViewClient = object : WebViewClient() {

            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hjuujukikiloloolkkiikik(url)) {

                        val vfgttggtgtgt = Intent(Intent.ACTION_VIEW)
                        vfgttggtgtgt.data = Uri.parse(url)
                        startActivity(vfgttggtgtgt)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                gthyyhhyhyhy(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show()
            }


        }
        bgnnhhhyhyyhgtgt.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                bgbg6gb56gb5gt5tg?.onReceiveValue(null)
                bgbg6gb56gb5gt5tg = filePathCallback
                var bghyhyhyyhyyh2y6h: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (bghyhyhyyhyyh2y6h!!.resolveActivity(packageManager) != null) {

                    var gtt5g5gtgt: File? = null
                    try {
                        gtt5g5gtgt = gtgtgttg()
                        bghyhyhyyhyyh2y6h.putExtra("PhotoPath", kiki5ik59k5lo95)
                    } catch (ex: IOException) {
                    }

                    if (gtt5g5gtgt != null) {
                        kiki5ik59k5lo95 = "file:" + gtt5g5gtgt.absolutePath
                        bghyhyhyyhyyh2y6h.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(gtt5g5gtgt)
                        )
                    } else {
                        bghyhyhyyhyyh2y6h = null
                    }
                }
                val gtgttg5gt5t = Intent(Intent.ACTION_GET_CONTENT)
                gtgttg5gt5t.addCategory(Intent.CATEGORY_OPENABLE)
                gtgttg5gt5t.type = "image/*"
                val gthyyhhy5hy5hy: Array<Intent?> =
                    bghyhyhyyhyyh2y6h?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val vfvfffrfr2fr2 = Intent(Intent.ACTION_CHOOSER)
                vfvfffrfr2fr2.putExtra(Intent.EXTRA_INTENT, gtgttg5gt5t)
                vfvfffrfr2fr2.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                vfvfffrfr2fr2.putExtra(Intent.EXTRA_INITIAL_INTENTS, gthyyhhy5hy5hy)
                startActivityForResult(
                    vfvfffrfr2fr2, gthyy5
                )
                return true
            }

            @Throws(IOException::class)
            private fun gtgtgttg(): File {
                var gtgt5h5yhhy8hy5 = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!gtgt5h5yhhy8hy5.exists()) {
                    gtgt5h5yhhy8hy5.mkdirs()
                }

                gtgt5h5yhhy8hy5 =
                    File(gtgt5h5yhhy8hy5.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return gtgt5h5yhhy8hy5
            }

        }

        bgnnhhhyhyyhgtgt.loadUrl(gtggtt())
    }

    private fun gtughgthgtgth() {
        fjrfirfirfjrffr()
    }




    private fun frffrrr(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val vfvffr6rf6rf6 = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $vfvffr6rf6rf6"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val bggtthyhyhyhyhy =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $bggtthyhyhyhyhy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val hyhujujujnnbbvv = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $hyhujujujnnbbvv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun gjitijgtjitg(): Int {
        val fghtugt = 5+5+5+58+559+5959+5+5+5
        val fghtugt1 = 5+5+5+58+559+5959+5+5+5
        val fghtugt2 = 5+5+5+58+559+5959+5+5+5
        val fghtugt3 = 5+5+5+58+559+5959+5+5+5
        val ffrrfrf = fghtugt+ fghtugt1+ fghtugt2+fghtugt3
        return ffrrfrf
    }

    private fun gtgtjgtjgt() {
        Snackbar.make(
            fvfrrgtgttgtg.root,
            "You win  points",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private fun gtggtt(): String {
        val gtgtyhyhyffrfrr = "deviceID="
        val hyhyujujikkiikik = "sub_id_1="
        val hyyhujujujkiki = "ad_id="
        val jukkiikikik = "sub_id_4="
        val hyhynhhnhnuju = "sub_id_5="
        val hyjuujujuj = "sub_id_6="
        val hyyhhyhyyh = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val myTrIDfrgtt: String? = Hawk.get(AppClaaaaasss.gtkkgt, "null")
        val cpOnegtgtgt:String? = Hawk.get(gtjgtjjgti)
        val thhyhyyhyhy: String? = Hawk.get(AppClaaaaasss.gktkogt, "null")


//        lifecycleScope.launch {
//            Snackbar.make(
//                fvfrrgtgttgtg.root, "naming is ${cpOnegtgtgt}",
//                Snackbar.LENGTH_LONG
//            ).show()
//        }
        val bggtgtgtgt: String? = Hawk.get(ididid, "null")

        val hyjuujjuujjuuj: String = Hawk.get(AppClaaaaasss.apapapapdjfjhf)

        val hjuujujujuj = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)


        var hhyhyyhyyy = ""

        val gtggttg = gtgtgtjigtigti()

        val bggttgtggtgtgt = "naming"

        val bgggtgtgtgtgttg: String = Hawk.get(lllllinnka)


        if (hyjuujjuujjuuj == "1"){
            hhyhyyhyyy =
                "$bgggtgtgtgtgttg$hyhyujujikkiikik$cpOnegtgtgt&$gtgtyhyhyffrfrr$hjuujujujuj&$hyyhujujujkiki$bggtgtgtgt&$jukkiikikik$bgbgbg6gb6bgb3g&$hyhynhhnhnuju$gtggttg&$hyjuujujuj$bggttgtggtgtgt"
            frffrrr(hjuujujujuj.toString())
        } else {
            hhyhyyhyyy =
                "$bgggtgtgtgtgttg$gtgtyhyhyffrfrr$myTrIDfrgtt&$hyyhujujujkiki$thhyhyyhyhy&$jukkiikikik$bgbgbg6gb6bgb3g&$hyhynhhnhnuju$gtggttg&$hyjuujujuj$bggttgtggtgtgt"
            frffrrr(myTrIDfrgtt.toString())
        }
        Log.d("lolo", "link is $hhyhyyhyyy")

        return hyyhhyhyyh.getString("SAVED_URL", hhyhyyhyyy).toString()
    }

    private fun gtgtgtjigtigti() = Build.VERSION.RELEASE

    fun gthyyhhyhyhy(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (ktgkogtkot == "") {
                ktgkogtkot = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }


    private fun hjuujukikiloloolkkiikik(uri: String): Boolean {

        val fvkffvjfvvfhfvhfvhu = packageManager
        try {

            fvkffvjfvvfhfvhfvhu.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gthyy5 || bgbg6gb56gb5gt5tg == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var vfnfvnffhrhhrffrh: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                vfnfvnffhrhhrffrh = arrayOf(Uri.parse(kiki5ik59k5lo95))
            } else {
                val kiikikikik = data.dataString
                if (kiikikikik != null) {
                    vfnfvnffhrhhrffrh = arrayOf(Uri.parse(kiikikikik))
                }
            }
        }
        bgbg6gb56gb5gt5tg?.onReceiveValue(vfnfvnffhrhhrffrh)
        bgbg6gb56gb5gt5tg = null
    }


    private var tgigtjgtijgtjigtjjgt = false
    override fun onBackPressed() {


        if (bgnnhhhyhyyhgtgt.canGoBack()) {
            if (tgigtjgtijgtjigtjjgt) {
                bgnnhhhyhyyhgtgt.stopLoading()
                bgnnhhhyhyyhgtgt.loadUrl(ktgkogtkot)
            }
            this.tgigtjgtijgtjigtjjgt = true
            bgnnhhhyhyyhgtgt.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                tgigtjgtijgtjigtjjgt = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }



    var ktgkogtkot = ""

}