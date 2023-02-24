package com.example.myquizapp

import java.util.*

object Constants {
    fun getPhyQuestions(): ArrayList<Questions>{
        val phyQuestions = ArrayList<Questions>()
        //que1
        val Que1 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            3
        )
        phyQuestions.add(Que1)
        //que2
        val Que2 = Questions(
            2, "If the velocity of the car is 30m/s, How much distance covered by car in 2 minute?",
            R.drawable.phyque2,
            "1.5 Km", "15 Km", "3.6 Km", "60 Km",
            3
        )
        phyQuestions.add(Que2)
        //que3
        val Que3 = Questions(
            3, "Which of the following is the correct equation of the constant acceleration?",
            R.drawable.phyque3,
            "v = u + at", "a = (v + u)/t", "v = u - at", "u = v - at",
            1
        )
        phyQuestions.add(Que3)
        //que4
        val Que4 = Questions(
            4, "Which of the following is the correct formula of momentum?",
            R.drawable.phyque4,
            "P = ma", "P = mv", "P = v/m", "P = m/v",
            2
        )
        phyQuestions.add(Que4)
        //que5
        val Que5 = Questions(
            5, "The Universal Law of Gravitation was given by",
            R.drawable.phyque5,
            "Albert Einstein", "Galileo Galilei", "Nicolaus Copernicus", "Isaac Newton",
            4
        )
        phyQuestions.add(Que5)
        //que6
        val Que6 = Questions(
            6, "Which of the following is the correct formula of the weight of the object?",
            R.drawable.phyque6,
            "W = mG", "W = mg", "W = m/g", "W = F/g",
            2
        )
        phyQuestions.add(Que6)
        //que7
        val Que7 = Questions(
            7, "Which of the following is the correct formula of the power?",
            R.drawable.phyque7,
            "P = W/t", "P = W/v", "P = Wt", "P = W/m",
            1
        )
        phyQuestions.add(Que7)
        //que8
        val Que8 = Questions(
            8, "Which of the following entities affects the work done by the object?",
            R.drawable.phyque8,
            "Force(F)", "Displacement(s)", "Both", "None of these",
            3
        )
        phyQuestions.add(Que8)
        //que9
        val Que9 = Questions(
            9, "What is the audible range of sound for human beings?",
            R.drawable.phyque9,
            "200Hz-2000Hz", "20kHz-200Khz", "20Hz-20kHz", "20Hz-200000Hz",
            3
        )
        phyQuestions.add(Que9)
        //que10
        val Que10 = Questions(
            10, "What is the velocity of the sound waves in the air?",
            R.drawable.phyque10,
            "340km/s", "240m/s", "240km/s", "340m/s",
            4
        )
        phyQuestions.add(Que10)
        return phyQuestions
    }



    fun getChemQuestions(): ArrayList<Questions>{
        val chemQuestions = ArrayList<Questions>()
        //que1
        val Que1 = Questions(
            1, "What is the physical state of water at 250 degree celsius?",
            R.drawable.phyque1,
            "Liquid", "Gas", "Not Sure", "Solid",
            2
        )
        chemQuestions.add(Que1)
        //que2
        val Que2 = Questions(
            2, "Convert the temperature 573K into degree celsius:",
            R.drawable.phyque1,
            "573 C", "500 C", "373 C", "300 C",
            4
        )
        chemQuestions.add(Que2)
        //que3
        val Que3 = Questions(
            3, "A ___________ is a homogeneous mixture of two or more substances.",
            R.drawable.phyque1,
            "Solution", "Pure Substance", "Distinguishable Mixure", "Water",
            1
        )
        chemQuestions.add(Que3)
        //que4
        val Que4 = Questions(
            4, "Which of the following has uniform composition?",
            R.drawable.phyque1,
            "Heterogeneous", "Homogeneous", "Both", "None of the above",
            2
        )
        chemQuestions.add(Que4)
        //que5
        val Que5 = Questions(
            5, "Which of the following is measure of the atomic radius?",
            R.drawable.phyque1,
            "10nm", "100nm", "1nm", "0.1nm",
            3
        )
        chemQuestions.add(Que5)
        //que6
        val Que6 = Questions(
            6, "Which of the following is the chemical formula of the salt?",
            R.drawable.phyque1,
            "Kcl", "Hcl", "Nacl", "Licl",
            3
        )
        chemQuestions.add(Que6)
        //que7
        val Que7 = Questions(
            7, "How many Electrons are there in the L shell of an atom?",
            R.drawable.phyque1,
            "8", "18", "2", "32",
            1
        )
        chemQuestions.add(Que7)
        //que8
        val Que8 = Questions(
            8, "What is the called an atomic number of an atom?",
            R.drawable.phyque1,
            "number of neutrons", "number of protons", "neutrons + protons", "protons + electrons",
            2
        )
        chemQuestions.add(Que8)
        //que9
        val Que9 = Questions(
            9, "How many neutrons are there in the Aluminium atom?",
            R.drawable.phyque1,
            "13", "15", "12", "14",
            4
        )
        chemQuestions.add(Que9)
        //que10
        val Que10 = Questions(
            10, "What is the molecule mass of two atoms of the water?",
            R.drawable.phyque1,
            "20", "18", "36", "34",
            2
        )
        chemQuestions.add(Que10)
        return chemQuestions
    }



    fun getMathsQuestions(): ArrayList<Questions>{
        val mathsQuestions = ArrayList<Questions>()
        //que1
        val Que1 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            3
        )
        mathsQuestions.add(Que1)
        //que2
        val Que2 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        mathsQuestions.add(Que2)
        //que3
        val Que3 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        mathsQuestions.add(Que3)
        //que4
        val Que4 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        mathsQuestions.add(Que4)
        //que5
        val Que5 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        mathsQuestions.add(Que5)
        //que6
        val Que6 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        mathsQuestions.add(Que6)
        //que7
        val Que7 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        mathsQuestions.add(Que7)
        //que8
        val Que8 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        mathsQuestions.add(Que8)
        //que9
        val Que9 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        mathsQuestions.add(Que9)
        //que10
        val Que10 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        mathsQuestions.add(Que10)
        return mathsQuestions
    }



    fun getGkQuestions(): ArrayList<Questions>{
        val gkQuestions = ArrayList<Questions>()
        //que1
        val Que1 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            3
        )
        gkQuestions.add(Que1)
        //que2
        val Que2 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        gkQuestions.add(Que2)
        //que3
        val Que3 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        gkQuestions.add(Que3)
        //que4
        val Que4 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        gkQuestions.add(Que4)
        //que5
        val Que5 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        gkQuestions.add(Que5)
        //que6
        val Que6 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        gkQuestions.add(Que6)
        //que7
        val Que7 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        gkQuestions.add(Que7)
        //que8
        val Que8 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        gkQuestions.add(Que8)
        //que9
        val Que9 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        gkQuestions.add(Que9)
        //que10
        val Que10 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        gkQuestions.add(Que10)
        return gkQuestions
    }



    fun getSSQuestions(): ArrayList<Questions>{
        val ssQuestions = ArrayList<Questions>()
        //que1
        val Que1 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            3
        )
        ssQuestions.add(Que1)
        //que2
        val Que2 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        ssQuestions.add(Que2)
        //que3
        val Que3 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        ssQuestions.add(Que3)
        //que4
        val Que4 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        ssQuestions.add(Que4)
        //que5
        val Que5 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        ssQuestions.add(Que5)
        //que6
        val Que6 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        ssQuestions.add(Que6)
        //que7
        val Que7 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        ssQuestions.add(Que7)
        //que8
        val Que8 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        ssQuestions.add(Que8)
        //que9
        val Que9 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        ssQuestions.add(Que9)
        //que10
        val Que10 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        ssQuestions.add(Que10)
        return ssQuestions
    }



    fun getGrammarQuestions(): ArrayList<Questions>{
        val grammarQuestions = ArrayList<Questions>()
        //que1
        val Que1 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            3
        )
        grammarQuestions.add(Que1)
        //que2
        val Que2 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        grammarQuestions.add(Que2)
        //que3
        val Que3 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        grammarQuestions.add(Que3)
        //que4
        val Que4 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        grammarQuestions.add(Que4)
        //que5
        val Que5 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        grammarQuestions.add(Que5)
        //que6
        val Que6 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        grammarQuestions.add(Que6)
        //que7
        val Que7 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        grammarQuestions.add(Que7)
        //que8
        val Que8 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        grammarQuestions.add(Que8)
        //que9
        val Que9 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        grammarQuestions.add(Que9)
        //que10
        val Que10 = Questions(
            1, "Which of the following is the correct formula of the newton's second law?",
            R.drawable.phyque1,
            "F = mv", "P = ma", "F = ma", "a = P/v",
            2
        )
        grammarQuestions.add(Que10)
        return grammarQuestions
    }
}