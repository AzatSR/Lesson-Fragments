package com.azat.studentslist

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeachersHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
    @SuppressLint("UseCompatLoadingForDrawables", "SetTextI18n")
    fun bind(teachers:TeachersAttributs){
        val teachersImage: ImageView = itemView.findViewById(R.id.banner_image_view)
        val teachersDescription: TextView = itemView.findViewById(R.id.description_text_view)
        val teachersName: TextView = itemView.findViewById(R.id.name_text_view)
        val teachersAge: TextView = itemView.findViewById(R.id.age_text_view)
        val teachersEmail: TextView = itemView.findViewById(R.id.email_text_view)
        val teacherProfArt: TextView = itemView.findViewById(R.id.prof_text_view)

        teachersImage.setImageDrawable(itemView.context.getDrawable(teachers.imageRes))
        teachersDescription.text = teachers.description
        teachersName.text = "Фамилия: ${teachers.name}"
        teachersAge.text = "Возраст: ${teachers.age}"
        teachersEmail.text = "Email: ${teachers.email}"
        teacherProfArt.text = "Специальность: \n${teachers.profArt}"
    }
}