package com.example.receiptapp

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var digitbread = 0
    var digitmilk = 0
    var digitsanitizer = 0
    var digitjelly = 0
    var sum: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val price1: String? = intent.getStringExtra("breadprice")
        val price2: String? = intent.getStringExtra("milkprice")
        val price3: String? = intent.getStringExtra("sanitizerprice")
        val price4: String? = intent.getStringExtra("jellyprice")

        digitbread = Integer.valueOf(price1)
        digitmilk = Integer.valueOf(price2)
        digitsanitizer = Integer.valueOf(price3)
        digitjelly = Integer.valueOf(price4)
        add()

        textView.text = price1
        textView2.text = price2
        textView3.text = price3
        textView4.text = price4
        textView5.text = sum.toString()
    }
    fun add(){
        sum = digitbread + digitmilk + digitsanitizer + digitjelly
    }
}