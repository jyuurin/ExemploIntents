package br.senac.exemplointents.implicito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExImplicitoBinding

class ExImplicito : AppCompatActivity() {

    lateinit var binding: ActivityExImplicitoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExImplicitoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener {
            // no implicito é um texto que tem a ação que ta resgistrada no android manisfest.
            var intent = Intent("br.senac.exemplointents.EXEMPLO")
            startActivity(intent)
        }
    }
}

//Intents implicitos: não sabe qual é a atividade. é necessario permissão. tem que definir uma ação = texto.
//abrir uma tela que tenha x perfil.
//precisa ir no manisfest para fazer algumas alterações.