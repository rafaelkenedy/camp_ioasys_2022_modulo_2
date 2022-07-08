package com.rafael.campioasys2022

import android.Manifest
import android.annotation.SuppressLint
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.motion.widget.Debug
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.rafael.campioasys2022.LoginActivity.Companion.TAG

class MainActivity : AppCompatActivity() {

    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var lastLocation: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lastLocation = findViewById(R.id.lastLocation)
        checkPermissionAndCheckLocation()
        getLocation()

        Log.i(TAG, Exception().stackTrace.first().methodName + ": ${this.localClassName}")
    }


    private fun checkPermissionAndCheckLocation() {
        val locationPermissionRequest = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissions ->
            if (permissions[Manifest.permission.ACCESS_FINE_LOCATION] == true &&
                permissions[Manifest.permission.ACCESS_COARSE_LOCATION] == true
            ) {
                Debug.getLocation()
            } else {
                Toast.makeText(
                    baseContext,
                    getString(R.string.request_location_permission),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        locationPermissionRequest.launch(
            arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
        )
    }

    @SuppressLint("SetTextI18n", "MissingPermission")
    private fun getLocation(){
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        fusedLocationClient.lastLocation
            .addOnSuccessListener { location: Location? ->
                lastLocation.text =
                    "Latitude: ${location?.latitude} \nLongitude: ${location?.longitude}"
            }.addOnFailureListener {
                lastLocation.text = it.message
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