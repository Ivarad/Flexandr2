package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.third_fragmentflex.*

class ThirdFragment : Fragment() {

        private lateinit var message: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        message = arguments?.getString("message").toString()

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

        return inflater.inflate(R.layout.third_fragmentflex, container,false)

    }

    override fun onViewCreated(view:View,savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        infoMess.text = message

        btback.setOnClickListener{fragmentManager!!.popBackStack()}
    }
}