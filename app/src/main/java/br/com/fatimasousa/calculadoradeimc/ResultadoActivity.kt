package br.com.fatimasousa.calculadoradeimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val resultado = intent.getDoubleExtra("INTENT_RESULTADO", 0.0)
        val texto : String = "Você está "

        if (resultado <= 16.9) {
            texto + "muito abaixo do peso. Atenção!"
        } else if (resultado > 16.9 && resultado <= 18.4) {
            texto + "abaixo do peso. Atenção!"
        } else if (resultado > 18.4 && resultado <= 24.9) {
            texto + "no peso ideal. Parabéns!"
        } else if (resultado > 24.9 && resultado <= 29.9) {
            texto + "acima do peso. Atenção!"
        } else if (resultado > 29.9 && resultado <= 34.9) {
            texto + "com obesidade grau I. Atenção!"
        } else if (resultado > 34.9 && resultado <= 40) {
            texto + "com obesidade grau II. Atenção!"
        } else {
            texto + "com obesidade grau III. Atenção!"
            txvResultadoTexto.text
        }

    }
}