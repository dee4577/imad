package com.example.myweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`detailedview.xml`)
        val dates = intent.getStringArrayListExtra("dates") ?: arrayListOf()

        val morningScreenTimes = intent.getIntegerArrayListExtra("maxTemperature") ?: arrayListOf()

        val afternoonScreenTimes = intent.getIntegerArrayListExtra("minTemperature") ?: arrayListOf()

        val activityNotes = intent.getStringArrayListExtra("averageTemperature") ?: arrayListOf()



        val detailsTextView = findViewById<TextView>(R.id.detailsTextView)

        val averageScreenTimeTextView = findViewById<TextView>(R.id.averagetextView5)

        val backButton = findViewById<Button>(R.id.backbutton)



        var totalTemperature = 0

        var displayText = ""

        for (i in dates.indices) {

            val dailytemperature = maxTemperature[i] + minTemperature[i]

            totalTemperature+= dailytemperature

            displayText += "Date: ${dates[i]}, temperature: ${maxTemperature[i]} , temperature: ${minTemperature[i]} min, Notes: ${averageTemperature[i]}\n\n"

        }

        val averageTemperature = if (dates.isNotEmpty()) totalTemperature / dates.size else 0



        detailsTextView.text = displayText

        averageScreenTimeTextView.text = "Average Screen Time: $averageTemperatureminutes/day"



        backButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)



        }

    }

}
}
}