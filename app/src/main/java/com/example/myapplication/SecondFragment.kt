package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ) : View? {
        return inflater.inflate(R.layout.fragment_blank,container, false)
    }
        override fun onViewCreated(view: View, savedInstanceState: Bundle?){
            super.onViewCreated(view, savedInstanceState)

            sendmess.setOnClickListener{

                val thirdFragment = ThirdFragment()

                var bndl : Bundle = Bundle()

                bndl.putString("message", editmess.text.toString())

                arguments?.putString("key", editmess.text.toString())
                thirdFragment.arguments = bndl

                val fragmentManager = fragmentManager
                assert(getFragmentManager() != null)

                fragmentManager!!.beginTransaction().replace(R.id.frame,thirdFragment).addToBackStack(null).commit()
            }
        }




}