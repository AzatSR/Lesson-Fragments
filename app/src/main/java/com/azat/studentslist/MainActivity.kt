package com.azat.studentslist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.util.Log

private const val LAST_SELECTED_ITEM = "LAST_SELECTED_ITEM"
private const val My_Own_Log_TAG="MyOwnLog"

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var appBarNavigation: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(My_Own_Log_TAG, "onCreate()")

        bottomNavigation = findViewById(R.id.bottom_navigation)
        appBarNavigation = findViewById(R.id.app_toolbar)


//создаем интенты, который перенаправляет на SecondActivity и на ThirdActivity
        appBarNavigation.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.project_button -> {
                    val intentSecond = Intent(this, SecondActivity::class.java)
                    startActivity(intentSecond)
                }
                R.id.info_button -> {
                    val intentThird = Intent(this, ThirdActivity::class.java)
                    startActivity(intentThird)
                }
            }
            true
        }


//создали два фрагмента, создали нижнюю навигацию
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
    override fun onStart() {
        super.onStart()
        Log.d(My_Own_Log_TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(My_Own_Log_TAG, "onResume()")
    }

    //в outState положим последний нажатый элемент
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigation.selectedItemId)
        super.onSaveInstanceState(outState)
        Log.d(My_Own_Log_TAG, "onSaveInstanceState()")
    }


    override fun onPause(){
        super.onPause()
        Log.d(My_Own_Log_TAG, "onPause()")
    }


    //пишем отдельную функцию под смену фрагментов
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null) //делаем чтобы фрагмент добавлялся назад
            .commit()
    }

    override fun onStop(){
        super.onStop()
        Log.d(My_Own_Log_TAG, "onStop()")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(My_Own_Log_TAG, "onDestroy()")
    }



}