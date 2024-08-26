package com.example.fuelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_RESULT_FUEL2 = "ResultActivity.KEY_FUEL2"

class ColetarDados3 : AppCompatActivity() {

    lateinit var button4 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coletar_dados3)

        button4 = findViewById<Button>(R.id.button4)

        val distf = findViewById<TextInputEditText>(R.id.Dist)

        val precocombustivel = intent.getFloatExtra("KEY_RESULT_FUEL", 0f)
        val tvlabel = intent.getFloatExtra("KEY_RESULT_FUEL2", 0f)

        button4.setOnClickListener {
            val dist : Float = distf.text.toString().toFloat()
            val intent = Intent (this, Result_Activity::class.java)
                .apply {
                    putExtra("KEY_RESULT_FUEL", precocombustivel)
                    putExtra("KEY_RESULT_FUEL2",tvlabel)
                    putExtra("KEY_RESULT_FUEL3",dist)

                    }

                }

            startActivity(intent)


        }
    }



//val preco = intent.getFloatExtra("KEY_RESULT_FUEL", 0.1f)
//val tv_label2= intent.getFloatExtra("KEY_RESULT_FUEL2", 0.1f)