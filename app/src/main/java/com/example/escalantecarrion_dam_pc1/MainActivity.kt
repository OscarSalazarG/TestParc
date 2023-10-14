package com.example.escalantecarrion_dam_pc1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etValor1: EditText =findViewById(R.id.etValor1)
        val etValor2: EditText =findViewById(R.id.etValor2)
        val btnSend: Button =findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            this.enviarNum1(etValor1.text.toString())
            this.enviarNum2(etValor2.text.toString())
        }
    }

    private fun enviarNum1(value: String){
        val intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("valor1", value)
        startActivity(intent)
    }

    private fun enviarNum2(value: String){
        val intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("valor2", value)
        startActivity(intent)
    }
}