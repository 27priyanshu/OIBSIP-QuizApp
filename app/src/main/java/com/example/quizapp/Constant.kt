@file:Suppress("UNREACHABLE_CODE")

package com.example.quizapp

object Constant {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        //1
        val ques1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_indian,
            "Argentina","India",
            "Maxico","America",
            2
        )
        questionsList.add(ques1)
        return questionsList

        //2
        val ques2 = Question(
            2,"What is the name of this Indian billionaire?",
            R.drawable.adani_billionar,
            "Mukesh Ambani","Shiv Nadar",
            "Gautam Adani","Dilip Shanghvi",
            3
        )
        questionsList.add(ques2)
        return questionsList

        //3
        val ques3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_maxico_flag,
            "Argentina","India",
            "Maxico","America",
            3 )
        questionsList.add(ques3)
        return questionsList

        //4
        val ques4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_american_flag,
            "Argentina","India",
            "Maxico","America",
            4
        )
        questionsList.add(ques4)
        return questionsList

        //5
        val ques5 = Question(
            5,"What is the name of this bird?",
            R.drawable.ic_parrot,
            "Peacock","Parrot",
            "Hen","Duck",
            2
        )
        questionsList.add(ques5)
        return questionsList

        //6
        val ques6 = Question(
            6,"What is the name of this bird?",
            R.drawable.peacock,
            "Peacock","Parrot",
            "Hen","Duck",
            1
        )
        questionsList.add(ques6)
        return questionsList




    }
}