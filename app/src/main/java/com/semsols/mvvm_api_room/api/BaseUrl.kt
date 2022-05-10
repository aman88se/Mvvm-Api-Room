package com.semsols.mvvm_api_room.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BaseUrl {

    const val BASE_URL = "https://api.imgflip.com/"

    fun getInstance() : Retrofit{
        return Retrofit.Builder().
                baseUrl(BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).
                build()
    }
}