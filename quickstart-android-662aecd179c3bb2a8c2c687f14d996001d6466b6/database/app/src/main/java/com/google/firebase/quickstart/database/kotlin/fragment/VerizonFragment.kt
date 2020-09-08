package com.google.firebase.quickstart.database.kotlin.fragment

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.firebase.quickstart.database.R

 class VerizonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val rootView: View = inflater.inflate(R.layout.fragment_verizon, container, false)

        return rootView

    }
}