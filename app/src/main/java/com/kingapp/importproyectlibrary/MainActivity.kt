package com.kingapp.importproyectlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.vtsen.sydneysuburbs.Sydney

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
                
          //  GenericTextView(name = "Data")

            Sydney
        }
    }
}