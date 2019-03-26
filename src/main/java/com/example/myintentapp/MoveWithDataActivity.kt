package com.example.myintentapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_move_with_data.*

class MoveWithDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
        val nama=intent.getStringExtra("Username")
        val password=intent.getIntExtra("password",0)
        tv_data_received.setText("User Name ="+ nama + ",\nPassword ="+password)
    }
}
