package com.nurika.motionlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simple.setOnClickListener {
            startActivity(Intent(this, Simple1Activity::class.java))
        }
        simple2.setOnClickListener {
            startActivity(Intent(this, Simple2Activity::class.java))
        }
        simple3.setOnClickListener {
            startActivity(Intent(this, SimpleTouchUpActivity::class.java))
        }

        imageFilter.setOnClickListener {
            startActivity(Intent(this, ImageFilterActivity::class.java))
        }

        keyFramePosition1.setOnClickListener {
            startActivity(Intent(this, KeyPosition1Activity::class.java))
        }

        keyFramePosition2.setOnClickListener {
            startActivity(Intent(this, KeyPosition2Activity::class.java))
        }

        cooLayout.setOnClickListener {
            startActivity(Intent(this, CooLayoutActivity::class.java))
        }

        parallax.setOnClickListener {
            startActivity(Intent(this, ParallaxActivity::class.java))
        }

        viewPager.setOnClickListener {
            startActivity(Intent(this, ViewPagerActivity::class.java))
        }
    }
}
