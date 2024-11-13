package ro.pub.cs.systems.eim.practicaltest01var07

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        // Preluăm datele trimise din MainActivity, dacă există
        val text1 = intent.getStringExtra("text1") ?: "N/A"
        val text2 = intent.getStringExtra("text2") ?: "N/A"
        val text3 = intent.getStringExtra("text3") ?: "N/A"
        val text4 = intent.getStringExtra("text4") ?: "N/A"

        // Găsim TextView-ul și afișăm datele primite
        val secondaryTextView = findViewById<TextView>(R.id.secondaryTextView)
        secondaryTextView.text = "Received:\n$text1\n$text2\n$text3\n$text4"
    }