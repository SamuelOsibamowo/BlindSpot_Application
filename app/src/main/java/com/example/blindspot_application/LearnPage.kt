package com.example.blindspot_application

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Vibrator
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LearnPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_page)

        val vibe = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        val lettersButton = findViewById<Button>(R.id.letters_button)
        val wordsButton = findViewById<Button>(R.id.words_button)
        val sentancesButton = findViewById<Button>(R.id.sentances_button)
        val paragraphsButton = findViewById<Button>(R.id.paragraphs_button)


        lettersButton.setOnClickListener{
            val intent = Intent(this,LettersActivity::class.java)
            startActivity(intent)
            vibe.vibrate(100)
        }

        wordsButton.setOnClickListener{
            val intent = Intent(this,WordsActivity::class.java)
            startActivity(intent)
            vibe.vibrate(100)
        }

        sentancesButton.setOnClickListener{
            val intent = Intent(this,SentancesActivity::class.java)
            startActivity(intent)
            vibe.vibrate(100)
        }

        paragraphsButton.setOnClickListener{
            val intent = Intent(this,ParagraphsActivity::class.java)
            startActivity(intent)
            vibe.vibrate(100)
        }
    }
}