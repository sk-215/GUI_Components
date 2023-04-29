package com.example.gui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvTxt: TextView =findViewById(R.id.tvTxt)
        val btFontSize: Button =findViewById(R.id.btFontSize)
        val btFontColor:Button=findViewById(R.id.btFontColor)
        val btBgColor:Button=findViewById(R.id.btBgColor)
        val linearLayout: LinearLayout= findViewById(R.id.linearLayout )
        var fontSize:Float=5f
        var fontColor:Int=0
        var backGroundColor:Int=0
        btFontSize.setOnClickListener {
        tvTxt.setTextSize(fontSize)
        fontSize=(fontSize+5)%50
        }
        btFontColor.setOnClickListener {
            when(fontColor%3){
                0-> tvTxt.setTextColor( Color.RED)
                1-> tvTxt.setTextColor( Color.GREEN)
                2-> tvTxt.setTextColor( Color.BLUE)
            }
            fontColor++
        }
        btBgColor.setOnClickListener {
            when(backGroundColor%3){
                0-> linearLayout.setBackgroundColor( Color.RED)
                1-> linearLayout.setBackgroundColor( Color.GREEN)
                2-> linearLayout.setBackgroundColor( Color.BLUE)
            }
            backGroundColor++
        }

    }
}