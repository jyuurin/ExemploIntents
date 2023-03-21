package br.senac.exemplointents.extras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExtrasBinding
import br.senac.exemplointents.databinding.ActivityExExtrasDetalheBinding

class ExExtrasDetalhe : AppCompatActivity() {

    lateinit var binding: ActivityExExtrasDetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExExtrasDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //pegar a string que foi enviada
        val nome = intent.getStringExtra("nome")
        val codigo = intent.getIntExtra("codigo", 0)
        //mudar no xml de detalhes!!
        binding.textNome.text = "Nome: $nome" //interpolação
        binding.textCodigo.text = codigo.toString()

        binding.buttonVoltar.setOnClickListener {
            finish() //desempilha. encerra a tela atual e volta pra anterior.
            //finishAffinity() //encerra tudo da aplicação!
        }

    }
}