package com.fungames.battletank

import com.fungames.battletank.adapteeeer.Couuuntryyy
import com.fungames.battletank.apclas.Devvvviiillly
import retrofit2.http.GET

interface DevvvAppp {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): retrofit2.Response<Couuuntryyy>

    @GET("const.json")
    suspend fun getDataDev(): retrofit2.Response<Devvvviiillly>
}
