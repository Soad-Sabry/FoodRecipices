package com.example.foodrecipices

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
=======
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
>>>>>>> ac6fa34 (food)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD
=======
     val bottomNavigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)
     val navController =Navigation.findNavController(this,R.id.frag_host)
     NavigationUI.setupWithNavController(bottomNavigation,navController)




>>>>>>> ac6fa34 (food)
    }
}