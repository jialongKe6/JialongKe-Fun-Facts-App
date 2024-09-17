package com.example.funfacts

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    companion object {
        private val funFacts = arrayOf(
            "A shrimp's heart is located in its head.",
            "The human nose can detect over 1 trillion different scents.",
            "Hot water can freeze faster than cold water under certain conditions. This is known as the Mpemba effect.",
            "It rains diamonds on Saturn and Jupiter due to high pressure in their atmospheres.",
            "Wombat poop is cube-shaped to prevent it from rolling away.",
            "There are more stars in the universe than grains of sand on all the Earth's beaches.",
            "Octopuses have blue blood due to a copper-based molecule called hemocyanin.",
            "The shortest commercial flight in the world is just 57 seconds long between two Scottish islands.",
            "Sloths can hold their breath longer than dolphins can.",
            "A group of crows is called a 'murder'.",
            "Cleopatra lived closer in time to the first Moon landing than to the construction of the Great Pyramid of Giza.",
            "Humans and giraffes have the same number of neck vertebrae: seven.",
            "A jiffy is an actual unit of time: 1/100th of a second.",
            "A snail can sleep for three years if the conditions aren't favorable for its survival.",
            "The inventor of the Pringles can is now buried in one."
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factTextView: TextView = findViewById(R.id.factTextView)
        val nextFactButton: Button = findViewById(R.id.nextFactButton)

        initializeTextView(factTextView)

        displayRandomFact(factTextView)

        nextFactButton.setOnClickListener {
            displayRandomFact(factTextView)
        }
    }

    private fun initializeTextView(factTextView: TextView) {
        factTextView.apply {
            textSize = 20f
            setTextColor(Color.DKGRAY)
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        }
    }

    private fun displayRandomFact(factTextView: TextView) {
        val randomFact = funFacts[Random.nextInt(funFacts.size)]
        factTextView.text = randomFact
    }
}
