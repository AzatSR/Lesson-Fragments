package com.azat.studentslist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView

class StudentsHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    @SuppressLint("UseCompatLoadingForDrawables", "SetTextI18n")
    fun bind(students:StudentsAttributs){
        val studentsImage:ImageView = itemView.findViewById(R.id.banner_image_view)
        val studentsDescription:TextView = itemView.findViewById(R.id.description_text_view)
        val studentsName:TextView = itemView.findViewById(R.id.name_text_view)
        val studentsAge:TextView = itemView.findViewById(R.id.age_text_view)
        val studentsEmail:TextView = itemView.findViewById(R.id.email_text_view)
        val studentsProf:TextView = itemView.findViewById(R.id.prof_text_view)

        studentsImage.setImageDrawable(itemView.context.getDrawable(students.imageRes))
        studentsDescription.text = students.description
        studentsName.text = "Фамилия: ${students.name}"
        studentsAge.text = "Возраст: ${students.age}"
        studentsEmail.text = "Email: ${students.email}"
        studentsProf.text = "Роль в команде: \n${students.prof}"
    }
}