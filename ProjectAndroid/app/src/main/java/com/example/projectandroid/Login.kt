package com.example.projectandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        btn_login.setOnClickListener{
            val intent = Intent (this, Mainframe:: class.java)
            startActivity(intent)
        }

        register.setOnClickListener{
            val intent = Intent(this, Register:: class.java)
            startActivity(intent)
        }

    }
    }

