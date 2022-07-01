package android.banananabandit.memequizapp

object Constants {

    fun getQuestions() : ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val q1 = Question(
            1,
            R.drawable.badluckbrian,
            "What is the name of this meme",
            "Good Luck Brian", "Unlucky Kid",
            "Bad Luck Brian", "Good Luck George",
            3)
        questionList.add(q1)

        val q2 = Question(
            2,
            R.drawable.onedoesnnotsimply,
            "In which situation this meme is used mostly",
            "When someone is showing restraint in doing something",
            "When someone doesn't do what they are expected to do",
            "To show someone how everything going in your life",
            "This is not really a meme",
            2)
        questionList.add(q2)

        val q3 = Question(
            3,
            R.drawable.successkid,
            "What is the name of this meme",
            "Kicking Ass", "Badass Kid",
            "Goals Achieved", "Success Kid",
            4)
        questionList.add(q3)

        val q4 = Question(
            4,
            R.drawable.onedoesnnotsimply,
            "In which situation this meme is used mostly",
            "When you like something that you see advertised",
            "When you pay for bills on time",
            "When you have no money but still spend some",
            "When you give your bro/sis some money",
            1)
        questionList.add(q4)

        val q5 = Question(
            5,
            R.drawable.exittwelve,
            "What is the name of this meme",
            "Exit 12", "Tokyo Drift",
            "Different Roads", "Fast Car",
            1)
        questionList.add(q5)

        val q6 = Question(
            6,
            R.drawable.distractedboyfriend,
            "In which situation this meme is used mostly",
            "When your bf is about to cheat on you",
            "When pass by your favourite shop",
            "When you already have something but want other thing",
            "When try to convince someone to do something nasty",
            3)
        questionList.add(q6)

        val q7 = Question(
            7,
            R.drawable.facepalm,
            "What is the name of this meme",
            "Horrible Things", "Headache",
            "Facepalm", "Playing Pick-a-Boo",
            3)
        questionList.add(q7)

        val q8 = Question(
            8,
            R.drawable.goodguygreg,
            "In which situation this meme is used mostly",
            "When someone does a random act of kindness",
            "When you're down to your last cigarette",
            "When your best friend is awesome",
            "When you finally managed to get something nice",
            1)
        questionList.add(q8)

        val q9 = Question(
            9,
            R.drawable.scumbagsteve,
            "What is the name of this meme",
            "Coming Back Home", "SBS",
            "Scumbag Steve", "Love for The Hats",
            3)
        questionList.add(q9)

        val q10 = Question(
            10,
            R.drawable.firstworldproblems,
            "In which situation this meme is used mostly",
            "When something doesn't go your way",
            "To signify trivial problems",
            "Show disbelief when something happens",
            "When someone spoils your life for you",
            2)
        questionList.add(q10)

        val q11 = Question(
            11,
            R.drawable.yodawg,
            "What is the name of this meme",
            "Xzibit Approves", "Smiling Black Man",
            "White Privilege Gets Denied", "Yo Dawg",
            4)
        questionList.add(q11)

        val q12 = Question(
            12,
            R.drawable.winteriscomingcomplaints,
            "In which situation this meme is used mostly",
            "When its the last day of autumn",
            "To signify disappointment regarding last season of GoT",
            "Show fake stoicism",
            "When someone masses of people are about to report the same news",
            4)
        questionList.add(q12)

        val q13 = Question(
            13,
            R.drawable.yodawg,
            "What is the name of this meme",
            "What if I told you", "Morpehus Knows",
            "We have to talk", "Morphin Time Doesnt Exist",
            1)
        questionList.add(q13)

        val q14 = Question(
            14,
            R.drawable.thatdbegreat,
            "In which situation this meme is used mostly",
            "When you want people to do what they supposed to do",
            "To slag off your annoying manager",
            "When you want to show workplace sarcasm",
            "To tell work stories",
            1)
        questionList.add(q14)

        val q15 = Question(
            15,
            R.drawable.philosoraptor,
            "What is the name of this meme",
            "Lizard Thinks", "Time to Wonder",
            "Philosophical Velociraptor", "Philosoraptor",
            4)
        questionList.add(q15)

        val q16 = Question(
            16,
            R.drawable.drake,
            "In which situation this meme is used mostly",
            "To tell a true meaning of the song",
            "To show preference of one thing over another",
            "To tell stories about shopping",
            "To educate someone on something stupid",
            2)
        questionList.add(q16)

        val q17 = Question(
            17,
            R.drawable.isthisa,
            "What is the name of this meme",
            "Annoying Butterfly", "Is this a ...?",
            "Outside School Activities", "Geeks Will Geek",
            2)
        questionList.add(q17)

        val q18 = Question(
            18,
            R.drawable.rollsafe,
            "In which situation this meme is used mostly",
            "To tell a situation when you get something",
            "To give advice on something nice",
            "To tell a matter of fact statement",
            "To tell a flawed logic statement",
            4)
        questionList.add(q18)

        val q19 = Question(
            19,
            R.drawable.thisisfine,
            "What is the name of this meme",
            "This is fine", "Room is on fire, yo",
            "Burning Puppy", "Monday Morning",
            1)
        questionList.add(q19)

        val q20 = Question(
            20,
            R.drawable.rollsafe,
            "In which situation this meme is used mostly",
            "To tell a best friend story",
            "To tell a story when you made a friend",
            "When two opposing sides agree on something",
            "To tell movie reference",
            2)
        questionList.add(q20)

        return questionList
    }
}