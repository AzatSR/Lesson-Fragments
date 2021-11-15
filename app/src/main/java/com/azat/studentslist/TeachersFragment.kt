package com.azat.studentslist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class TeachersFragment : Fragment() {

    private lateinit var teachersRecyclerView: RecyclerView

    val teachersList: List<TeachersAttributs> = listOf(
        TeachersAttributs(R.drawable.aleksandra, "Александра", "Сульдина", 32, "sasha@gmail.com"),
        TeachersAttributs(R.drawable.evgeniya, "Евгения", "Михайлова", 39, "beautyGenya@mail.ru"),
        TeachersAttributs(R.drawable.marina, "Марина", "Барышева", 30, "marina-nicebaby@yandex.com"),
        TeachersAttributs(R.drawable.olga, "Ольга", "Гончарова", 23, "olgaprofi@sport.be"),
        TeachersAttributs(R.drawable.svetlana, "Светлана", "Закирова", 26, "svetaLove@fitness.gym" )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_teachers, container, false)

        teachersRecyclerView = view.findViewById(R.id.teachers_recycler_view)
        teachersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        teachersRecyclerView.adapter = TeachersAdapter(teachersList)

        return view
    }


}
