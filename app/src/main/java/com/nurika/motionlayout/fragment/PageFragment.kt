package com.nurika.motionlayout.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.nurika.motionlayout.R

class PageFragment : Fragment() {

    private var name = "Page"

    override fun setArguments(args: Bundle?) {
        super.setArguments(args)
        if (args != null) {
            name = args.getString("name")!!
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.view_pager_page, container, false)
        val textView = view.findViewById<TextView>(R.id.namePage)
        textView.text = name
        return view
    }
}