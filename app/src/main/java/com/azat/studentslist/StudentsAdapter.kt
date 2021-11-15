package com.azat.studentslist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StudentsAdapter(private val studentsList: List<StudentsAttributs>) :
    RecyclerView.Adapter<StudentsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentsHolder {
        val studentsView = LayoutInflater.from(parent.context)
            .inflate(R.layout.students_list_view, parent, false)
        return StudentsHolder(studentsView)
    }

    override fun onBindViewHolder(holder: StudentsHolder, position: Int) {
        val students = studentsList[position]
        holder.bind(students)
    }

    override fun getItemCount(): Int {
        return studentsList.size
    }
}