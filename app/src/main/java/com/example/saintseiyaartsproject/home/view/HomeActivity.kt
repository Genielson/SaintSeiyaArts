package com.example.saintseiyaartsproject.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.saintseiyaartsproject.R
import com.example.saintseiyaartsproject.artistas.view.ArtistaFragment
import com.example.saintseiyaartsproject.classico.view.ClassicoFragment
import com.example.saintseiyaartsproject.omega.view.OmegaFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeFragment = HomeFragment()
        val classicFragment = ClassicoFragment()
        val omegaFragment = OmegaFragment()
        val artistaFragment = ArtistaFragment()
        showMainFragmentScreen(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {

            when(it.itemId){
                R.id.ic_home -> showMainFragmentScreen(homeFragment)
                R.id.ic_artista -> showMainFragmentScreen(artistaFragment)
                R.id.ic_classico -> showMainFragmentScreen(classicFragment)
                R.id.ic_omega -> showMainFragmentScreen(omegaFragment)
            }

            true
        }

    }

    fun showMainFragmentScreen(frameSection : Fragment){

        var manager = supportFragmentManager
        var transaction = manager.beginTransaction()
        transaction.replace(R.id.frameHome, frameSection)
        transaction.commit()

        //supportFragmentManager.beginTransaction().replace(R.id.frameHome,frameSection)
    }

}