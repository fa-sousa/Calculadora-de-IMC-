package br.com.fatimasousa.calculadoradeimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Abre a CalculadoraActivity após 4 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            // Faz a transição da Splash para Calculadora
            val intentCalculadora = Intent(this, CalculadoraActivity::class.java)
            startActivity(intentCalculadora)
            finish()
        }, 4000)
    }
}