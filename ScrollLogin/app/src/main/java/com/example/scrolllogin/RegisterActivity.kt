package com.example.scrolllogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scrolllogin.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_register)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGoLogin.setOnClickListener {
            onBackPressed()
        }

    /*btn_go_register.setOnClickListener {
           onBackPressed()
        }*/
    }

    override fun onBackPressed (){
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}