package com.example.myweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Mainscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`mainscreen.xml`)
        val dates = ArrayList<String>()

        val maxtemperature = ArrayList<Int>()

        val mintemperature = ArrayList<Int>()

        val averagetemperature= ArrayList<String>()

        override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)

            setContentView(R.layout.`MainActivity.xml`.xml`)



            val dateEditText = findViewById<EditText>(R.id.editTextDate2)

            val morningScreenTimeEditText = findViewById<EditText>(R.id.editTextNumber)

            val afternoonScreenTimeEditText = findViewById<EditText>(R.id.editTextNumber2)

            val activityNotesEditText = findViewById<EditText>(R.id.editTextNumber4)

            val addButton = findViewById<Button>(R.id.clearbutton)

            val clearButton = findViewById<Button>(R.id.morebutton)

            val viewDetailsButton = findViewById<Button>(R.id.exitbutton)
            addButton.setOnClickListener {

                val date = dateEditText.text.toString()

                val maxTemperature = maxTemperatureEditText.text.toString().toIntOrNull()

                val minTemperature = minTemperatureEditText.text.toString().toIntOrNull()

                val average = averageEditText.text.toString()



                if (date.isNotEmpty() && maxTemperature != null && minTemperature != null && average.isNotEmpty()) {

                    dates.add(date)

                    maxTemperature.add(maxTemperature)

                    minTemperature.add(minTemperature)

                    average.add(average)

                    Toast.makeText(this, "Data Added", Toast.LENGTH_SHORT).show()

                    clearFields(dateEditText, maxTemperatureEditText, mintemperatureEditText, averageEditText)

                } else {

                    Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()

                }

            }

//The code that is commented out below will clear all data saved in the arraylists!

            clearButton.setOnClickListener {

                //dates.clear()

                // MaxTemperatures.clear()

                //minTemperatures.clear()

                // average.clear()

                // Toast.makeText(this, "Data Cleared", Toast.LENGTH_SHORT).show()

                clearFields(dateEditText, maxTemperatureEditText, minTemperatureEditText, averageEditText)



            }



            viewDetailsButton.setOnClickListener {

                val intent = Intent(this, DetailedViewActivity::class.java)

                intent.putStringArrayListExtra("dates", dates)

                intent.putIntegerArrayListExtra("maxTemperature", maxTemperature)

                intent.putIntegerArrayListExtra("minTemperature", minTemperature)

                intent.putStringArrayListExtra("average", average

                startActivity(intent)

            }

        }



        private fun clearFields(vararg fields: EditText) {

            for (field in fields) {

                field.text.clear()

            }

        }

    }


