package com.azat.studentslist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TeachersAdapter(private val teachersList:List<TeachersAttributs>):RecyclerView.Adapter<TeachersHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeachersHolder {
        val teachersView = LayoutInflater.from(parent.context).inflate(R.layout.students_list_view, parent, false)
        return TeachersHolder(teachersView)
    }

    override fun onBindViewHolder(holder: TeachersHolder, position: Int) {
        val teachers = teachersList[position]
        holder.bind(teachers)
    }

    override fun getItemCount(): Int {
        return teachersList.size
    }
}