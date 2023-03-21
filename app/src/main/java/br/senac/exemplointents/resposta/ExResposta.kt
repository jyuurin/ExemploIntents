package br.senac.exemplointents.resposta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExRespostaBinding

class ExResposta : AppCompatActivity() {

    lateinit var binding : ActivityExRespostaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExRespostaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //executar algo qdo clica no botão
        binding.buttonIr.setOnClickListener {
            val intent = Intent(this, ExRespostaDetalhe::class.java)
            //Como iniciar a atividade>> precisa esperar uma resposta.
            //Duas APIs: a antiga:
            //iniciando a atividade esperando uma resposta.
            startActivityForResult(intent, 1)

        }
    }

    //callback
    //request code > indica quem fez a chamada da função | result code: o codigo mandado no setResult | data: intent com a resposta respostaIntent
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            val classe = data.getStringExtra("classe")

            when(classe) {
                "guerreiro" -> {
                    binding.buttonIr.text = "Classe: Guerreiro"
                    binding.buttonIr.setBackgroundColor(getColor(R.color.guerreiro))
                }
                "ladrao" -> {
                    binding.buttonIr.text = "Classe: Ladrão"
                    binding.buttonIr.setBackgroundColor(getColor(R.color.ladrao))
                }
                "mago" -> {
                    binding.buttonIr.text = "Classe: Mago"
                    binding.buttonIr.setBackgroundColor(getColor(R.color.mago))
                }
                "arqueiro" -> {
                    binding.buttonIr.text = "Classe: Arqueiro"
                    binding.buttonIr.setBackgroundColor(getColor((R.color.arqueiro)))
                }
            }
        }
    }
}