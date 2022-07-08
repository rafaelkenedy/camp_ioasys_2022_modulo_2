package com.rafael.campioasys2022

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    companion object {
        const val TAG = "Ciclo de vida"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.button)
        Log.i(TAG, Exception().stackTrace.first().methodName + ": ${this.localClassName}")

        button.apply {
            setOnClickListener {
                startActivity(Intent(context, MainActivity::class.java))
            }
        }
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