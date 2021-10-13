package com.logmessage

import android.content.Context
import android.util.Log
import android.widget.Toast

class LogMessage {


    companion object {
        public var tag:String = "Application Library";
        fun logmessage(c: Context?, message: String?) {

            Log.i(tag, message.toString())


        }
    }
}