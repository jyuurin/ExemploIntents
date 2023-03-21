package br.senac.exemplointents.resposta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExRespostaBinding
import br.senac.exemplointents.databinding.ActivityExRespostaDetalheBinding

class ExRespostaDetalhe : AppCompatActivity() {

    lateinit var binding: ActivityExRespostaDetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExRespostaDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGuerreiro.setOnClickListener {
            responder("guerreiro")
        }
        binding.buttonArqueiro.setOnClickListener {
            responder("arqueiro")
        }
        binding.buttonLadrao.setOnClickListener {
            responder("ladrao")
        }
        binding.buttonMago.setOnClickListener {
            responder("mago")
        }
    }

    fun responder(classe: String) {
        //intent de resposta retorna pra onde chamou, então nao passa nada.
        val respostaIntent = Intent()

        //configurar a resposta.
        respostaIntent.putExtra("classe", classe)
        //Responder ok e o que foi escolhido.
        setResult(RESULT_OK, respostaIntent)

        finish()
    }
}