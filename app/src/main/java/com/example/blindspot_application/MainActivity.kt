package com.example.blindspot_application

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Vibrator
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        val learnButton = findViewById<Button>(R.id.learn_Button)
        val practiceButton = findViewById<Button>(R.id.practice_Button)
        val seeAllButton = findViewById<ImageButton>(R.id.seeAll_Button)


        //On click listener that watches when the learn/practice/seeAll button is pushed and then takes the user to the respective Activity

        learnButton.setOnClickListener{
            val intent = Intent(this,LearnPage::class.java)
            startActivity(intent)
        }

        practiceButton.setOnClickListener{
            val intent = Intent(this,PracticePage::class.java)
            startActivity(intent)
        }

        seeAllButton.setOnClickListener{
            val intent = Intent(this,SeeMorePage::class.java)
            startActivity(intent)
        }


    }
}



