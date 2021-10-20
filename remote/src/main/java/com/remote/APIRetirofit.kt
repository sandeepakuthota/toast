package com.remote

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import okhttp3.Protocol
import java.net.CookieManager
import java.net.CookiePolicy
import java.util.*
import java.nio.file.attribute.AclEntry.newBuilder
import okhttp3.OkHttpClient





interface APIRetirofit {

    @GET("/api/v1/employees")
    fun getMovies() : Call<List<Movie>>

    @GET("/users")
    fun getusers() : Call<List<User>>



    companion object {
        //https://dummy.restapiexample.com/api/v1/employees
        var BASE_URL = "https://dummy.restapiexample.com"

    fun create(baseurl:String): APIRetirofit {
        val okHttpClient = OkHttpClient()
        val retrofit = Retrofit.Builder()
            .baseUrl(baseurl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(APIRetirofit::class.java)


       /* val retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(WeatherService::class.java)*/
    }

        /*fun provideOkHttpClient(): OkHttpClient {

            *//*val cookieManager = CookieManager()
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL)

            val client = OkHttpClient.Builder()
                .cookieJar(JavaNetCookieJar(cookieManager))
                .addNetworkInterceptor(provideRequestInterceptor())
                .addNetworkInterceptor(provideLoggingInterceptor())
                .protocols(Arrays.asList(Protocol.HTTP_1_1))
                .build()

            return client*//*
          *//*  val baseOkHttpClient = OkHttpClient()

            OkHttpClient okHttpClientV1 = baseOkHttpClient.newBuilder()
                .followRedirects(false)
                .build()*//*
            return okHttpClientV1;
        }
*/
}
}