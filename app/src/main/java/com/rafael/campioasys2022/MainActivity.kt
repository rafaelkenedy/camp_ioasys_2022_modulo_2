package com.rafael.campioasys2022

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rafael.campioasys2022.LoginActivity.Companion.TAG

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Log.i(TAG, Exception().stackTrace.first().methodName + ": ${this.localClassName}")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, Exception().stackTrace.first().methodName + ": ${this.localClassName}")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, Exception().stackTrace.first().methodName + ": ${this.localClassName}")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, Exception().stackTrace.first().methodName + ": ${this.localClassName}")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, Exception().stackTrace.first().methodName + ": ${this.localClassName}")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, Exception().stackTrace.first().methodName + ": ${this.localClassName}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, Exception().stackTrace.first().methodName + ": ${this.localClassName}")
    }
}