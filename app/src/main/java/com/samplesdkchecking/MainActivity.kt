package com.samplesdkchecking

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.logmessage.LogMessage
import com.remote.APIRetirofit
import com.remote.Movie
import com.remote.User
import com.toastmessage.ToastMessage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.google.gson.GsonBuilder

import com.google.gson.Gson




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // "javatpoint"
        //ToasterActivity.toastmessage(this,"this is sdk testing example")
        //ToasterActivity.toastmessage(this,"this is sdk testing example")

        ToastMessage.toastmessage(this,"this is latest commit123")
        LogMessage.logmessage(this,"this is latest commit123")

        val base_url:String = "https://jsonplaceholder.typicode.com/"
        val apiInterface = APIRetirofit.create(base_url).getusers()

        apiInterface.enqueue( object : Callback<List<User>> {

            override fun onResponse(call: Call<List<User>>?, response: Response<List<User>>?) {

                Log.i("info message",""+"<><><>"+call?.request())
                Log.i("info message",""+"<><><>"+response?.body())

              //  val fromUser = Gson().fromJson(response?.body(), User::class.java)

                if(response?.body() != null){
                   // Log.i("this is latest commit123","<><><>"+response?.body())
                    Log.i("info message",""+"<><><>"+response?.body())
                }

                //  recyclerAdapter.setMovieListItems(response.body()!!)
            }

            override fun onFailure(call: Call<List<User>>?, t: Throwable?) {
                Log.i("info message",""+"<><><>"+call?.request())
                Log.i("info message",""+"<><><>"+"threowd from service"+ t.toString())


            }
        })

        val base_url1:String = "https://dummy.restapiexample.com"

        val apiInterface1 = APIRetirofit.create(base_url1).getMovies()

        apiInterface1.enqueue( object : Callback<List<Movie>> {

            override fun onResponse(call: Call<List<Movie>>?, response: Response<List<Movie>>?) {

                Log.i("info message",""+"<><><>"+call?.request())
                Log.i("info message",""+"<><><>"+response?.body())

                //  val fromUser = Gson().fromJson(response?.body(), User::class.java)

                if(response?.body() != null){
                    // Log.i("this is latest commit123","<><><>"+response?.body())
                    Log.i("info message",""+"<><><>"+response?.body())
                }

                //  recyclerAdapter.setMovieListItems(response.body()!!)
            }

            override fun onFailure(call: Call<List<Movie>>?, t: Throwable?) {
                Log.i("info message",""+"<><><>"+call?.request())
                Log.i("info message",""+"<><><>"+"threowd from service"+ t.toString())


            }
        })
    }
}


