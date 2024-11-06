package com.example.myapp
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.R

class SecondActivity : AppCompatActivity() {
    private var currentNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        currentNumber = intent.getIntExtra("number", 0)


        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        numberTextView.text = currentNumber.toString()

        val decreaseButton = findViewById<Button>(R.id.decreaseButton)
        decreaseButton.setOnClickListener {
            currentNumber -= 1
            numberTextView.text = currentNumber.toString()
        }
    }
}
