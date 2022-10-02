package com.example.lesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

private const val EXTRA_ANSWER_IS_TRUE = "vvp.antey.geoquiz.answer_is_true"
const val EXTRA_ANSWER_SHOWN = "vvp.antey.geoquiz.answer_shown"
class CheatActivity : AppCompatActivity() {
    private var answerIsTrue = false
    private lateinit var showAnswerButton : Button
    private lateinit var answerTextView :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        answerIsTrue = intent?.getBooleanExtra(EXTRA_ANSWER_IS_TRUE,false)?:false
        setContentView(R.layout.activity_cheat)
        answerTextView = findViewById(R.id.text_answer)
        showAnswerButton = findViewById(R.id.show_answer_button)
        val answerText = when{
            answerIsTrue -> R.string.true_button
            else -> R.string.false_button
        }
        answerTextView.setText(answerText)

    }
}