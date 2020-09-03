package br.com.fatimasousa.calculadoradeimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculadora.*

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        // Executa o clique do botão calcular
        btnCalculadoraCalcular.setOnClickListener {
            // Captura dados inseridos pelo usuário
            val peso = edtCalculadoraPeso.text.toString()
            val altura = edtCalculadoraAltura.text.toString()

            // Valida e calcula campos digitados
            if(peso.isEmpty() || altura.isEmpty()){
                Toast.makeText(this, "Por favor, preencha todos os campos!", Toast.LENGTH_LONG).show()
            } else {
                fun calcularImc (peso : Double, altura : Double): Double {
                    val resultado = peso / (altura * altura)
                    return resultado
                }
                val mIntent = Intent(this,ResultadoActivity::class.java )
                startActivity(mIntent)
                finish()
            }
        }
    }
}