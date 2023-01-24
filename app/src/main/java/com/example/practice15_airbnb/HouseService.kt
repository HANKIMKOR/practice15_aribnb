package com.example.practice15_airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("https://run.mocky.io/v3/2705a2db-5aa5-4a51-adad-91718f36d842")
    fun getHouseList(): Call<HouseDto>
}