package ro.pub.cs.systems.eim.practicaltest01var07

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var07MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var07_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)

        val setButton = findViewById<Button>(R.id.setButton)

        setButton.setOnClickListener {
            // Creăm intenția pentru a deschide activitatea secundară
            val intent = Intent(this, SecondaryActivity::class.java)

            // Putem trimite valori din EditText-uri, dacă este necesar
            intent.putExtra("text1", editText1.text.toString())
            intent.putExtra("text2", editText2.text.toString())
            intent.putExtra("text3", editText3.text.toString())
            intent.putExtra("text4", editText4.text.toString())

            startActivity(intent)
        }
    }
}