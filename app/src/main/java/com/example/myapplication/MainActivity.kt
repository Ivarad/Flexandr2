package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = PageAdapter(supportFragmentManager)

        adapter.addFragment(FirstFragment(),"Первый фрагмент")
        adapter.addFragment(SecondFragment(),"Второй фрагмент")


        viewPager.adapter = adapter
        Tabs.setupWithViewPager(viewPager)

    }
}
