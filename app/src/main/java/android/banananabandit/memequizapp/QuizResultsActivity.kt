package android.banananabandit.memequizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class QuizResultsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_results)

        val nameTextView = findViewById<TextView>(R.id.result_name)
        val finalResult = findViewById<TextView>(R.id.final_result)
        val finishButton = findViewById<Button>(R.id.finish_button)

        val name = intent.getStringExtra(Constants.USER_NAME)
        val correctAns = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalAns = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        nameTextView.text = "$name, your result is:"
        finalResult.text = "$correctAns/$totalAns"

        finishButton.setOnClickListener {
            val finalIntent = Intent(this, MainActivity::class.java)
            startActivity(finalIntent)
            finish()
        }
    }
}