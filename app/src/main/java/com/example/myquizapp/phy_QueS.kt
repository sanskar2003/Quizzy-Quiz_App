package com.example.myquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import java.util.*

class phy_QueS : AppCompatActivity(), View.OnClickListener {
    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null
    private var tvOption1: TextView? = null
    private var tvOption2: TextView? = null
    private var tvOption3: TextView? = null
    private var tvOption4: TextView? = null
    private var correctAns: Int = 0
    var cp: Int = 0
    private val phyQuestions = Constants.getPhyQuestions()
    private var selectedOption: Int = 0
    var totalCorrected: Int = 0
    var totalMarks: Int = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phy_ques)
        val name: String? = intent.getStringExtra("name")

        progressBar = findViewById(R.id.progressBar)
        progressBar?.max = 10
        tvProgress = findViewById(R.id.progressText)
        tvQuestion = findViewById(R.id.question)
        ivImage = findViewById(R.id.que_image)
        tvOption1 = findViewById(R.id.option1)
        tvOption2 = findViewById(R.id.option2)
        tvOption3 = findViewById(R.id.option3)
        tvOption4 = findViewById(R.id.option4)

        tvOption1?.setOnClickListener(this)
        tvOption2?.setOnClickListener(this)
        tvOption3?.setOnClickListener(this)
        tvOption4?.setOnClickListener(this)

        setQuestion()

        val submit: Button = findViewById(R.id.submit)
        submit.setOnClickListener{
            if(selectedOption==0){
                Toast.makeText(this, "Please select any option!!", Toast.LENGTH_SHORT).show()
            }
            else{
                if (selectedOption == correctAns){
                    totalMarks = totalMarks + 1;
                }
                optionsView()
                cp++;
                if(cp == phyQuestions.size-1){
                    submit.text = "FINISH"
                }
                if(cp==phyQuestions.size){
                    cp = 0
                    val intent = Intent(this, result::class.java)
                    intent.putExtra("Result", totalMarks.toString())
                    intent.putExtra("name", name)
                    startActivity(intent)
                    finish()
                }else{
                    setQuestion()
                }
            }
        }

    }

    @SuppressLint("SetTextI18n")
    public fun setQuestion(){
        val Question: Questions = phyQuestions[cp]
        ivImage?.setImageResource(Question.image)
        progressBar?.progress = cp+1
        tvProgress?.text= "${cp+1}/10"
        tvQuestion?.text = Question.Question
        tvOption1?.text = Question.option1
        tvOption2?.text = Question.option2
        tvOption3?.text = Question.option3
        tvOption4?.text = Question.option4
        correctAns = Question.correctAns
    }

    public fun optionsView(){
        selectedOption = 0
        val options = ArrayList<TextView>()
        tvOption1?.let{ options.add(0, it) }
        tvOption2?.let{ options.add(1, it) }
        tvOption3?.let{ options.add(2, it) }
        tvOption4?.let{ options.add(3, it) }
        for(option in options){
            option.setTextColor(Color.parseColor("#DD2E2E2E"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.text_border)
        }
    }

    private fun selectedOptionView(tv:TextView, selectedOptionNum: Int){
        optionsView()
        selectedOption = selectedOptionNum
        tv.typeface = Typeface.DEFAULT_BOLD
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_text_border)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.option1 -> {
                tvOption1?.let{ selectedOptionView(it, 1) }
            }
            R.id.option2 -> {
                tvOption2?.let{ selectedOptionView(it, 2) }
            }
            R.id.option3 -> {
                tvOption3?.let{ selectedOptionView(it, 3) }
            }
            R.id.option4 -> {
                tvOption4?.let{ selectedOptionView(it, 4) }
            }
        }
    }
}