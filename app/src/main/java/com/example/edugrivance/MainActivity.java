package com.example.loginapp

package com.example.loginapp

import android.content.Intent
import android.net.wifi.hotspot2.pps.Credential
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

        lateinit var username :EditText
        lateinit var password :EditText
        lateinit var login :Button

        val usernameV = "admin"
        val passwordV = "1234"
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.username_input)
        password = findViewById(R.id.password_input)
        login = findViewById(R.id.login_button)


        login.setOnClickListener{
        val username = username.text.toString()
        val password =password.text.toString()
        Log.i("Test Credentials","Username : $username and password : $password")

        if(username == usernameV && password == passwordV){
        startActivity(Intent(this,MainActivity2::class.java))

        }
        }
        }
        }