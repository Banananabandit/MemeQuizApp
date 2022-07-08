package android.banananabandit.memequizapp

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Intent
import android.graphics.Color
import android.graphics.Color.parseColor
import android.graphics.LinearGradient
import android.graphics.drawable.GradientDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.TextView

class QuizResultsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_results)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.decorView.windowInsetsController!!.hide(
                android.view.WindowInsets.Type.statusBars()
            )
        }

        val nameTextView = findViewById<TextView>(R.id.result_name)
        val finalResult = findViewById<TextView>(R.id.final_result)
        val finishButton = findViewById<Button>(R.id.finish_button)
        val nothingTextView = findViewById<TextView>(R.id.nothing)

        val name = intent.getStringExtra(Constants.USER_NAME)
        val correctAns = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalAns = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)


        val colorAnimation = ObjectAnimator.ofInt(nothingTextView, "textColor", Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA)
        colorAnimation.duration = 5000
        colorAnimation.interpolator = LinearInterpolator()
        colorAnimation.repeatCount = 4
        colorAnimation.start()

        nameTextView.text = "$name, your result is:"
        finalResult.text = "$correctAns/$totalAns"



        finishButton.setOnClickListener {
            val finalIntent = Intent(this, MainActivity::class.java)
            startActivity(finalIntent)
            finish()
        }
    }
}