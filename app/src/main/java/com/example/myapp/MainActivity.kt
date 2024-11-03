package com.example.myapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.R

class MainActivity : AppCompatActivity() {
    private lateinit var numberEditText: EditText
    private lateinit var displayTextView: TextView
    private var enteredNumber: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up the header
        val header = findViewById<TextView>(R.id.header)
        header.setBackgroundColor(0xFF6200EE.toInt()) // #6200EE
        header.text = "MidTermBtuEasy"

        // Initialize UI elements
        numberEditText = findViewById(R.id.numberEditText)
        displayTextView = findViewById(R.id.displayTextView)

        // Set up the buttons
        val okButton = findViewById<Button>(R.id.okButton)
        okButton.setOnClickListener {
            enteredNumber = numberEditText.text.toString().toIntOrNull()
            displayTextView.text = "Your number is $enteredNumber"
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("number", enteredNumber)
            startActivity(intent)
        }
    }
}