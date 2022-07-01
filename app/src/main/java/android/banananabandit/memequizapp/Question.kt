package android.banananabandit.memequizapp

data class Question(
    val questionId : Int,
    val image : Int,
    val question : String,
    val optOne : String,
    val optTwo : String,
    val optThree : String,
    val optFour : String,
    val correctAnswer : Int
)
