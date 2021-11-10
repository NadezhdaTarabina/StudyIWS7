package com.stydu.coffeetea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val selectStoreButton: Button = findViewById(R.id.select_store_button)

        val favoriteActivityIntent = Intent (this, FavoriteActivity::class.java)

        selectStoreButton.setOnClickListener {
            Toast.makeText(this, "Work", Toast.LENGTH_LONG).show()
            startActivity(favoriteActivityIntent)

        }

        val bottomNavigationMenuView: BottomNavigationView = findViewById(R.id.bottom_navigation)


        bottomNavigationMenuView.setOnItemSelectedListener  { item ->
            when (item.itemId) {
                R.id.store_bottom_navigator -> {
                    // Respond to navigation item 1 click

                }
                R.id.favorite_bottom_navigator -> {
                    // Respond to navigation item 2 click
                    startActivity(favoriteActivityIntent)
                    Toast.makeText(this, "Work", Toast.LENGTH_LONG).show()
                    true

                }
                R.id.shopping_cart_bottom_navigator -> {
                    // Respond to navigation item 1 click

                }
                else -> return@setOnItemSelectedListener false
            }
            return@setOnItemSelectedListener true
        }


    }


}