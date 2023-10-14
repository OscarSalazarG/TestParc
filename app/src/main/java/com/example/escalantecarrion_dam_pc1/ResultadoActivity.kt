package com.example.escalantecarrion_dam_pc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val num1 =intent.getStringExtra("valor1").toInt()
        val num2 =intent.getStringExtra("valor2").toInt()

        val txtSuma =findViewById<TextView>(R.id.txtSuma)
        val txtResta =findViewById<TextView>(R.id.txtResta)
        val txtMulti =findViewById<TextView>(R.id.txtMult)
        val txtDiv =findViewById<TextView>(R.id.txtDiv)

        val suma = (num1?.plus(num2!!))
        val resta = (num1?.minus(num2!!))



    }
}