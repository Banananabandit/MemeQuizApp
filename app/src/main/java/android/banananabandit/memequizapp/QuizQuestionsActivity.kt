package android.banananabandit.memequizapp

import android.content.ContentValues.TAG
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    // Here we need some global variables that we can use outside onCreate()
    private var mCurrentPosition : Int = 1
    private var mQuestionsList : ArrayList<Question>? = null
    private var mSelectedAnswerPosition : Int = 0

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

        answerOne?.setOnClickListener(this)
        answerTwo?.setOnClickListener(this)
        answerThree?.setOnClickListener(this)
        answerFour?.setOnClickListener(this)
        submitAnswerButton?.setOnClickListener(this)


        mQuestionsList = Constants.getQuestions()

        setQuestion()

    }

    private fun setQuestion() {
        resetViewsToDefaultOptions()
        val question = mQuestionsList!![mCurrentPosition - 1]
        questionImage?.setImageResource(question.image)
        progressBar?.progress = mCurrentPosition
        progressNumber?.text = "$mCurrentPosition / ${progressBar?.max}"
        questionText?.text = question.question
        answerOne?.text = question.optOne
        answerTwo?.text = question.optTwo
        answerThree?.text = question.optThree
        answerFour?.text = question.optFour

        if (mCurrentPosition == mQuestionsList!!.size) {
            submitAnswerButton?.text = "Finish"
        }else {
            submitAnswerButton?.text = "Submit"
        }
    }

    // We call this method before we change the text view that we have selected
    // We need the array list here just for the covenience of cycling through all of the views to set them
    private fun resetViewsToDefaultOptions() {
        val options = ArrayList<TextView>()
        answerOne?.let {
            options.add(0, it) // it is a lambda and refers to answerOne textView
        }
        answerTwo?.let {
            options.add(1, it)
        }
        answerThree?.let {
            options.add(2, it)
        }
        answerFour?.let {
            options.add(3, it)
        }
        for (i in options) {
            i.setTextColor(Color.parseColor("#7A8089"))
            i.typeface = Typeface.DEFAULT
            i.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOption(textView : TextView, selectedOptionNumber : Int) {
        resetViewsToDefaultOptions()
        mSelectedAnswerPosition = selectedOptionNumber
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    override fun onClick(view : View?) {
        when(view?.id) {
            R.id.textViewOptOne -> {
                answerOne?.let {
                    selectedOption(it, 1)
                }
            }
            R.id.textViewOptTwo -> {
                answerTwo?.let {
                    selectedOption(it, 2)
                }
            }
            R.id.textViewOptThree-> {
                answerThree?.let {
                    selectedOption(it, 3)
                }
            }
            R.id.textViewOptFour -> {
                answerFour?.let {
                    selectedOption(it, 4)
                }
            }
            R.id.buttonSubmitAnswer -> {
                // Increment our questionPosition only if the options have been reset
                // I don't really like this, may refactor this logic
                // TODO: refactor how we get to the next question
                if (mSelectedAnswerPosition == 0) {
                    mCurrentPosition++
                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            Toast.makeText(this, "FIniShedDD", Toast.LENGTH_LONG).show()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mSelectedAnswerPosition) {
                        setCorrectWrongAnswerView(mSelectedAnswerPosition, R.drawable.wrong_option_border_bg)
                    }
                    // Regardless if wrong or not always display the correct answer
                    setCorrectWrongAnswerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        submitAnswerButton?.text = "FINISH"
                    } else {
                        submitAnswerButton?.text = "GO TO NXT QUESTION"
                    }
                    mSelectedAnswerPosition = 0
                }

            }
        }
    }
    // This function is to assign the color to the correct/wrong answers
    private fun setCorrectWrongAnswerView(answer : Int, drawableView : Int) {
        when(answer) {
            1 -> {
                answerOne?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            2 -> {
                answerTwo?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            3 -> {
                answerThree?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            4 -> {
                answerFour?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
        }
    }
}












