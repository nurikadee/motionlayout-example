package com.nurika.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.nurika.motionlayout.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_parallax.*
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addPage("Page 1")
        adapter.addPage("Page 2")
        adapter.addPage("Page 3")
        pager.adapter = adapter
        tabs.setupWithViewPager(pager)

        if (motionLayout != null) {
            pager.addOnPageChangeListener(motionLayout as ViewPager.OnPageChangeListener)
        }
    }
}
