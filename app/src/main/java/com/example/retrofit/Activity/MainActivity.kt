package com.example.retrofit.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit.Application.Application
import com.example.retrofit.R
import com.example.retrofit.ViewModel.MainViewModel
import com.example.retrofit.ViewModel.MainViewModelFactory
import javax.inject.Inject

class MainActivity: AppCompatActivity () {

    lateinit var mainViewModel: MainViewModel
    @Inject
    lateinit var viewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as Application).applicationComponent.inject( this)

        mainViewModel=ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
        mainViewModel.Users?.observe(this){
            for(i in it)
                Log.d("123456",i._id+" "+i.email+" "+i.name)
        }

    }

    fun check()
    {
        var t:TextView=findViewById(R.id.text)
        var b:Button=findViewById(R.id.button2)

        mainViewModel.b.observe(this) {
            t.text = it.toString()
            Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
        }

        Log.d("123456", mainViewModel.toString())

        b.setOnClickListener(View.OnClickListener {
            mainViewModel.increament()
        })
    }
}