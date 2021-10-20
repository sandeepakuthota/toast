package com.remote

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APIRetirofit {

    @GET("volley_array.json")
    fun getMovies() : Call<List<Movie>>

    companion object {

        var BASE_URL = "http://velmm.com/apis/"

    fun create(): APIRetirofit {

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        return retrofit.create(APIRetirofit::class.java)


       /* val retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(WeatherService::class.java)*/
    }

}
}