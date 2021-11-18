package com.azat.studentslist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class StudentsFragment : Fragment() {

    private lateinit var studentsRecyclerView: RecyclerView

    val studentsList: List<StudentsAttributs> = listOf(
        StudentsAttributs(R.drawable.antony, "Антон", "Елистратов", 35, "antony@free.so", "UI/UX дизайнер"),
        StudentsAttributs(R.drawable.boris, "Борис", "Кузнецов", 38, "boris@greed.gu", "Scrum-мастер"),
        StudentsAttributs(R.drawable.gregory, "Григорий", "Мартынкевич", 21, "gregory@mask.be", "QA-специалист"),
        StudentsAttributs(R.drawable.nikky, "Николай", "Степанов", 33, "nikky@koler.cj", "Frontend-разработчик"),
        StudentsAttributs(R.drawable.tim, "Тимофей", "Прокопенко", 24, "tim@writer.xw", "Backend-разработчик"),
        StudentsAttributs(R.drawable.stepan, "Степан", "Гречанников", 32, "stepanWW@dry.bg", "Embedded-программист"),
        StudentsAttributs(R.drawable.valerij, "Валерий", "Мирошниченко", 20, "valerchik@vdw.rf", "Системный аналитик"),
        StudentsAttributs(R.drawable.yurij, "Юрий", "Новиков", 24, "yura@kms.kz", "Android-разработчик")
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment: увеличить макет для этого фрагмента
        val view = inflater.inflate(R.layout.fragment_students, container, false)


        //в фрагментах findViewById вызывается только из view
        studentsRecyclerView = view.findViewById(R.id.students_recycler_view)
        studentsRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        studentsRecyclerView.adapter = StudentsAdapter(studentsList)
            return view
    }

}



