package com.example.receiptapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //var editText: String = ""
    var breadprice: String = ""
    var milkprice: String = ""
    var sanitizerprice: String = ""
    var jellyprice: String =""
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn_submit)
        button.setOnClickListener {
            breadprice = edit1.text.toString()
            milkprice = edit2.text.toString()
            sanitizerprice = edit3.text.toString()
            jellyprice = edit4.text.toString()
            val intentMain = Intent(this,MainActivity2::class.java)
             intentMain.putExtra("breadprice",breadprice)
             intentMain.putExtra("milkprice",milkprice)
             intentMain.putExtra("sanitizerprice",sanitizerprice)
             intentMain.putExtra("jellyprice",jellyprice)
            startActivity(intentMain)

        }
    }
}