package com.semsols.mvvm_api_room.api

import com.semsols.mvvm_api_room.model.MemeModel
import retrofit2.Response
import retrofit2.http.GET

interface MemeInterface {

    @GET("/get_memes")
    suspend fun getMemes() : Response<MemeModel>

}