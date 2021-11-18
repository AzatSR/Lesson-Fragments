package com.azat.studentslist

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan
import android.widget.Space
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var project1Text: TextView
    private lateinit var project2Text: TextView
    private lateinit var project3Text: TextView
    private lateinit var project4Text: TextView
    private lateinit var project5Text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        project1Text = findViewById(R.id.pr1)
        val mypr1SpannableString = SpannableString(project1Text.text)
        mypr1SpannableString.setSpan(UnderlineSpan(), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mypr1SpannableString.setSpan(ForegroundColorSpan(Color.RED), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        project1Text.text = mypr1SpannableString


        project2Text = findViewById(R.id.pr2)
        val mypr2SpannableString = SpannableString(project2Text.text)
        mypr2SpannableString.setSpan(UnderlineSpan(), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mypr2SpannableString.setSpan(ForegroundColorSpan(Color.RED), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        project2Text.text = mypr2SpannableString


        project3Text = findViewById(R.id.pr3)
        val mypr3SpannableString = SpannableString(project3Text.text)
        mypr3SpannableString.setSpan(UnderlineSpan(), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mypr3SpannableString.setSpan(ForegroundColorSpan(Color.RED), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        project3Text.text = mypr3SpannableString


        project4Text = findViewById(R.id.pr4)
        val mypr4SpannableString = SpannableString(project4Text.text)
        mypr4SpannableString.setSpan(UnderlineSpan(), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mypr4SpannableString.setSpan(ForegroundColorSpan(Color.RED), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        project4Text.text = mypr4SpannableString


        project5Text = findViewById(R.id.pr5)
        val mypr5SpannableString = SpannableString(project5Text.text)
        mypr5SpannableString.setSpan(UnderlineSpan(), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mypr5SpannableString.setSpan(ForegroundColorSpan(Color.RED), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        project5Text.text = mypr5SpannableString


    }
}