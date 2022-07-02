package android.banananabandit.memequizapp

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {

    private var progressBar : ProgressBar? = null
    private var progressNumber : TextView? = null
    private var questionImage : ImageView? = null
    private var questionText : TextView? = null
    private var answerOne : TextView? = null
    private var answerTwo : TextView? = null
    private var answerThree : TextView? = null
    private var answerFour : TextView? = null
    private var submitAnswerButton : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        progressNumber = findViewById(R.id.textViewNumberOfQuestions)
        questionImage = findViewById(R.id.imageViewQuestionPicture)
        questionText = findViewById(R.id.textViewQuestion)
        answerOne = findViewById(R.id.textViewOptOne)
        answerTwo = findViewById(R.id.textViewOptTwo)
        answerThree = findViewById(R.id.textViewOptThree)
        answerFour = findViewById(R.id.textViewOptFour)
        submitAnswerButton = findViewById(R.id.buttonSubmitAnswer)

        val questionsList = Constants.getQuestions()
        
        for(i in questionsList) {
            Log.d(TAG, "onCreate: First Answer: ${i.optOne}\n")
        }

        var currentPosition = 1
        val question = questionsList[currentPosition - 1]
        questionImage?.setImageResource(question.image)
        progressBar?.progress = currentPosition
        progressNumber?.text = "$currentPosition / ${progressBar?.max}"
        questionText?.text = question.question
        answerOne?.text = question.optOne
        answerTwo?.text = question.optTwo
        answerThree?.text = question.optThree
        answerFour?.text = question.optFour

    }
}