package com.azat.studentslist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "LAST_SELECTED_ITEM"

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var appBarNavigation: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.bottom_navigation)
        appBarNavigation = findViewById(R.id.app_toolbar)


//создали три фрагмента, создали нижнюю навигацию
        bottomNavigation.setOnItemSelectedListener { item ->

            var fragment: Fragment? = null
            //проверяем все элементы по id-шникам
            when (item.itemId) {
                R.id.student_list -> {
                    fragment =
                        StudentsFragment()     //при нажатии на student_list(кнопка студенты) будет открываться StudentsFragmnent
                }
                R.id.teachers_list -> {
                    fragment =
                        TeachersFragment()     // при нажатии на teachers_list(кнопка преподаватели) соответственно TeacherFragment
                }
            }
            replaceFragment(fragment!!)   //совершить замену
            true
        }
        //сохранить то, что ввел. если не ввел, то по дефолту student_list
        bottomNavigation.selectedItemId =
            savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.student_list
    }

    override fun onSaveInstanceState(outState: Bundle) {
        //в outState положим последний нажатый элемент
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigation.selectedItemId)
        super.onSaveInstanceState(outState)
    }


    //пишем отдельную функцию под смену фрагментов
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null) //делаем чтобы фрагмент добавлялся назад
            .commit()
    }
}