package android.banananabandit.memequizapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); // This is to disable the night mode
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.decorView.windowInsetsController!!.hide(
                android.view.WindowInsets.Type.statusBars()
            )
        }
        val buttonStartQuiz = findViewById<Button>(R.id.buttonStart)
        val nameEntry = findViewById<EditText>(R.id.nameEntry)
        buttonStartQuiz.setOnClickListener {
            if (nameEntry.text.isNotEmpty()) {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            } else if (nameEntry.text.isEmpty()) {
                Toast.makeText(this, "Enter your name, dum-dum", Toast.LENGTH_LONG).show()
            }
        }
    }
}