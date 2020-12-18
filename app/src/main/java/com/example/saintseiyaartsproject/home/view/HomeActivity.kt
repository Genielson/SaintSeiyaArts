package com.example.saintseiyaartsproject.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.saintseiyaartsproject.HomeFragment
import com.example.saintseiyaartsproject.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        showFragmentScreen()
    }

    fun showFragmentScreen(){

        var manager = supportFragmentManager
        var transaction = manager.beginTransaction()
        transaction.replace(R.id.frameHome,HomeFragment())
        transaction.commit()

    }
}