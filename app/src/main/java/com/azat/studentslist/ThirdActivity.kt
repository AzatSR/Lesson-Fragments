package com.azat.studentslist

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class ThirdActivity : AppCompatActivity() {

    private lateinit var detailsButton: Button
    private lateinit var authorText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        detailsButton = findViewById(R.id.detail_button)
        //создаем неявный интент в виде ссылки на Odin.study
        val link = Uri.parse("https://odin.study/ru")
        val thirdActivityintent = Intent(Intent.ACTION_VIEW, link)
//запускаем поиск
        detailsButton.setOnClickListener {
            startActivity(thirdActivityintent)
        }

//меняем цвет текста в выбранном диапазоне используя класс SpannableString
        authorText = findViewById(R.id.author_text_view)
        val makeSpannableString = SpannableString(authorText.text)

        val changeToRed = ForegroundColorSpan(Color.RED)
        val changeToBlue = ForegroundColorSpan(Color.BLUE)

        makeSpannableString.setSpan(changeToRed, 31, 61, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        makeSpannableString.setSpan(changeToBlue, 104, 117, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        authorText.text = makeSpannableString


    }



}