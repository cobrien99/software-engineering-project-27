package com.example.uiapplication

import android.R
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.ar.core.Anchor
import com.google.ar.core.Plane
import com.google.ar.core.Point
import com.google.ar.sceneform.AnchorNode
import com.google.ar.sceneform.rendering.ModelRenderable
import com.google.ar.sceneform.ux.ArFragment
import com.google.ar.sceneform.ux.TransformableNode

import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


    }




<<<<<<< HEAD
=======
    private fun getScreenCenter(): Point {
        val vw = findViewById<View>(android.R.id.content)
        return Point(vw.width / 2, vw.height / 2)
    }
>>>>>>> f9f0629e34b2cbb749cd8b2b174d307a67d8e9b6


}


